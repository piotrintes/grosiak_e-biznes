package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class ChartRepository @Inject()(dbConfigProvider: DatabaseConfigProvider, userRepository: UserRepository, productRepository: ProductRepository)(implicit ec: ExecutionContext) {
  private val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  private class ChartTable(tag: Tag) extends Table[Chart](tag, "chart") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def user = column[Int]("name")
    def product: Rep[Long] = column[Long]("product")
    def count: Rep[Int] = column[Int]("count")
    def user_fk = foreignKey("user_fk",user, usr)(_.id)
    def product_fk = foreignKey("product_fk",product, prd)(_.id)
    def * = (id, user, product, count) <> ((Chart.apply _).tupled, Chart.unapply)
  }

  import userRepository.UserTable
  private val usr = TableQuery[UserTable]
  import productRepository.ProductTable
  private val prd = TableQuery[ProductTable]

  private val chart = TableQuery[ChartTable]

  def create(user: Int, product: Long, count: Int): Future[Chart] = db.run {
    (chart.map(o => (o.user, o.product, o.count))
      returning chart.map(_.id)
      into {case ((user,product,count),id) => Chart(id, user, product, count)}
      ) += (user, product, count)
  }

  def list(): Future[Seq[Chart]] = db.run {
    chart.result
  }
}