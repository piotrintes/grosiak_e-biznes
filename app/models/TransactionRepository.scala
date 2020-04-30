package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class TransactionRepository @Inject()(dbConfigProvider: DatabaseConfigProvider, userRepository: UserRepository, productRepository: ProductRepository)(implicit ec: ExecutionContext) {
  private val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  private class TransactionTable(tag: Tag) extends Table[Transaction](tag, "transaction") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def user = column[Int]("name")
    def product: Rep[Long] = column[Long]("product")
    def count: Rep[Int] = column[Int]("count")
    def price: Rep[Double] = column[Double]("price")
    def date: Rep[String] = column[String]("date")
    def user_fk = foreignKey("user_fk",user, usr)(_.id)
    def product_fk = foreignKey("product_fk",product, prd)(_.id)
    def * = (id, user, product, count, price, date) <> ((Transaction.apply _).tupled, Transaction.unapply)
  }

  import userRepository.UserTable
  import productRepository.ProductTable
  private val usr = TableQuery[UserTable]
  private val prd = TableQuery[ProductTable]

  private val transaction = TableQuery[TransactionTable]

  def create(user: Int, product: Long, count: Int, price: Double, date: String): Future[Transaction] = db.run {
    (transaction.map(t => (t.user, t.product, t.count, t.price, t.date))
      returning transaction.map(_.id)
      into {case ((user,product,count,price,date),id) => Transaction(id, user, product, count,price,date)}
      ) += (user, product, count, price, date)
  }

  def list(): Future[Seq[Transaction]] = db.run {
    transaction.result
  }

  def delete(id: Int): Future[Unit] = db.run(transaction.filter(_.id === id).delete).map(_ => ())

  def update(id: Int, new_transaction: Transaction): Future[Unit] = {
    val transactionToUpdate: Transaction = new_transaction.copy(id)
    db.run(transaction.filter(_.id === id).update(transactionToUpdate)).map(_ => ())
  }

  def getById(id: Int): Future[Transaction] = db.run {
    transaction.filter(_.id === id).result.head
  }

  def getByIdOption(id: Int): Future[Option[Transaction]] = db.run {
    transaction.filter(_.id === id).result.headOption
  }
}

