package models

import java.util.UUID

import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ ExecutionContext, Future }

@Singleton
class CartRepository @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  private val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  private class CartTable(tag: Tag) extends Table[Cart](tag, "cart") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def user = column[Int]("user")
    def product: Rep[Long] = column[Long]("product")
    def count: Rep[Int] = column[Int]("count")
    def * = (id, user, product, count) <> ((Cart.apply _).tupled, Cart.unapply)
  }

  private val cart = TableQuery[CartTable]

  def create(user: Int, product: Long, count: Int): Future[Cart] = db.run {
    (cart.map(o => (o.user, o.product, o.count))
      returning cart.map(_.id)
      into { case ((user, product, count), id) => Cart(id, user, product, count) }
    ) += (user, product, count)
  }

  def list(): Future[Seq[Cart]] = db.run {
    cart.result
  }

  def list(user_id: Int): Future[Seq[Cart]] = db.run {
    cart.filter(_.user === user_id).result
  }

  def delete(id: Int): Future[Unit] = db.run(cart.filter(_.id === id).delete).map(_ => ())

  def update(id: Int, new_cart: Cart): Future[Unit] = {
    val cartToUpdate: Cart = new_cart.copy(id)
    db.run(cart.filter(_.id === id).update(cartToUpdate)).map(_ => ())
  }

  def getById(id: Int): Future[Cart] = db.run {
    cart.filter(_.id === id).result.head
  }

  def getByIdOption(id: Int): Future[Option[Cart]] = db.run {
    cart.filter(_.id === id).result.headOption
  }
}