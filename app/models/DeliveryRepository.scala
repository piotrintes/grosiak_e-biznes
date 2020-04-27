package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class DeliveryRepository @Inject()(dbConfigProvider: DatabaseConfigProvider, transactionRepository: TransactionRepository)(implicit ec: ExecutionContext) {
  private val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  private class DeliveryTable(tag: Tag) extends Table[Delivery](tag, "delivery") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def transaction = column[Int]("name")
    def date: Rep[String] = column[String]("date")
    //def transaction_fk = foreignKey("user_fk",transaction, trs)(_.id)
    def * = (id, transaction, date) <> ((Delivery.apply _).tupled, Delivery.unapply)
  }

  import transactionRepository.TransactionTable
  //private val trs = TableQuery[TransactionTable]

  private val delivery = TableQuery[DeliveryTable]

  def create(id: Int, transaction: Int, date: String): Future[Delivery] = db.run {
    (delivery.map(t => (t.transaction, t.date))
      returning delivery.map(_.id)
      into {case ((transaction, date),id) => Delivery(id, transaction, date)}
      ) += (transaction, date)
  }

  def list(): Future[Seq[Delivery]] = db.run {
    delivery.result
  }

  def delete(id: Int): Future[Unit] = db.run(delivery.filter(_.id === id).delete).map(_ => ())

  def update(id: Int, new_delivery: Delivery): Future[Unit] = {
    val deliveryToUpdate: Delivery = new_delivery.copy(id)
    db.run(delivery.filter(_.id === id).update(deliveryToUpdate)).map(_ => ())
  }
}

