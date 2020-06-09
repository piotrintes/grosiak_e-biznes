package models

import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ ExecutionContext, Future }

@Singleton
class PaymentRepository @Inject() (dbConfigProvider: DatabaseConfigProvider, transactionRepository: TransactionRepository)(implicit ec: ExecutionContext) {
  private val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  private class PaymentTable(tag: Tag) extends Table[Payment](tag, "payment") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def transaction = column[Int]("transaction")
    def date: Rep[String] = column[String]("date")
    //def transaction_fk = foreignKey("user_fk",transaction, trs)(_.id)
    def * = (id, transaction, date) <> ((Payment.apply _).tupled, Payment.unapply)
  }
  //private val trs = TableQuery[TransactionTable]

  private val payment = TableQuery[PaymentTable]

  def create(transaction: Int, date: String): Future[Payment] = db.run {
    (payment.map(t => (t.transaction, t.date))
      returning payment.map(_.id)
      into { case ((transaction, date), id) => Payment(id, transaction, date) }
    ) += (transaction, date)
  }

  def list(): Future[Seq[Payment]] = db.run {
    payment.result
  }

  def delete(id: Int): Future[Unit] = db.run(payment.filter(_.id === id).delete).map(_ => ())

  def update(id: Int, new_payment: Payment): Future[Unit] = {
    val paymentToUpdate: Payment = new_payment.copy(id)
    db.run(payment.filter(_.id === id).update(paymentToUpdate)).map(_ => ())
  }

  def getById(id: Int): Future[Payment] = db.run {
    payment.filter(_.id === id).result.head
  }

  def getByTIdOption(id: Int): Future[Option[Payment]] = db.run {
    payment.filter(_.transaction === id).result.headOption
  }

  def getByIdOption(id: Int): Future[Option[Payment]] = db.run {
    payment.filter(_.id === id).result.headOption
  }
}

