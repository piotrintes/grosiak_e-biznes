package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class PrOpinionRepository @Inject()(dbConfigProvider: DatabaseConfigProvider, userRepository: UserRepository, productRepository: ProductRepository)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class PrOpinionTable(tag: Tag) extends Table[PrOpinion](tag, "prOpinion") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def user = column[Int]("name")
    def product: Rep[Int] = column[Int]("product")
    def stars: Rep[Int] = column[Int]("stars")
    def text: Rep[String] = column[String]("text")
    def user_fk = foreignKey("user_fk",user, usr)(_.id)
    def product_fk = foreignKey("product_fk",product, prd)(_.id)
    def * = (id, user, product, stars, text) <> ((PrOpinion.apply _).tupled, PrOpinion.unapply)
  }

  import userRepository.UserTable
  private val usr = TableQuery[UserTable]
  import productRepository.ProductTable
  private val prd = TableQuery[ProductTable]

  val opinion = TableQuery[PrOpinionTable]

  def create(user: Int, product: Int, stars: Int, text: String): Future[PrOpinion] = db.run {
    (opinion.map(o => (o.user, o.product, o.stars, o.text))
      returning opinion.map(_.id)
      into {case ((user,product,stars,text),id) => PrOpinion(id, user, product, stars, text)}
      ) += (user, product, stars, text)
  }

  def list(): Future[Seq[PrOpinion]] = db.run {
    opinion.result
  }
}

