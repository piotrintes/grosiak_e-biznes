package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class TransactionRepository @Inject()(dbConfigProvider: DatabaseConfigProvider, userRepository: UserRepository, productRepository: ProductRepository)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class TransactionTable(tag: Tag) extends Table[Transaction](tag, "transaction") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def user = column[Int]("name")
    def product: Rep[Int] = column[Int]("product")
    def count: Rep[Int] = column[Int]("count")
    def price: Rep[Double] = column[Double]("price")
    def date: Rep[String] = column[String]("date")
    def user_fk = foreignKey("user_fk",user, usr)(_.id)
    def product_fk = foreignKey("product_fk",product, prd)(_.id)
    def * = (id, user, product, count, price, date) <> ((Transaction.apply _).tupled, Transaction.unapply)
  }

  import userRepository.UserTable
  private val usr = TableQuery[UserTable]
  import productRepository.ProductTable
  private val prd = TableQuery[ProductTable]

  val transaction = TableQuery[TransactionTable]

  def create(id: Int, user: Int, product: Int, count: Int, price: Double, date: String): Future[Transaction] = db.run {
    (transaction.map(t => (t.user, t.product, t.count, t.price, t.date))
      returning transaction.map(_.id)
      into {case ((user,product,count,price,date),id) => Transaction(id, user, product, count,price,date)}
      ) += (user, product, count, price, date)
  }

  def list(): Future[Seq[Transaction]] = db.run {
    transaction.result
  }
}

