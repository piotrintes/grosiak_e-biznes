package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class PaymentRepository @Inject()(dbConfigProvider: DatabaseConfigProvider, transactionRepository: TransactionRepository)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class PaymentTable(tag: Tag) extends Table[Payment](tag, "chart") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def transaction = column[Int]("name")
    def date: Rep[String] = column[String]("date")
    def transaction_fk = foreignKey("user_fk",transaction, trs)(_.id)
    def * = (id, transaction, date) <> ((Payment.apply _).tupled, Payment.unapply)
  }

  import transactionRepository.TransactionTable
  private val trs = TableQuery[TransactionTable]

  val payment = TableQuery[PaymentTable]

  def create(id: Int, transaction: Int, date: String): Future[Payment] = db.run {
    (payment.map(t => (t.transaction, t.date))
      returning payment.map(_.id)
      into {case ((transaction, date),id) => Payment(id, transaction, date)}
      ) += (transaction, date)
  }

  def list(): Future[Seq[Payment]] = db.run {
    payment.result
  }
}

