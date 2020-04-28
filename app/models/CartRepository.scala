package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class CartRepository @Inject()(dbConfigProvider: DatabaseConfigProvider, userRepository: UserRepository, productRepository: ProductRepository)(implicit ec: ExecutionContext) {
  private val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  private class CartTable(tag: Tag) extends Table[Cart](tag, "cart") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def user = column[Int]("name")
    def product: Rep[Long] = column[Long]("product")
    def count: Rep[Int] = column[Int]("count")
    def user_fk = foreignKey("user_fk",user, usr)(_.id)
    def product_fk = foreignKey("product_fk",product, prd)(_.id)
    def * = (id, user, product, count) <> ((Cart.apply _).tupled, Cart.unapply)
  }

  import userRepository.UserTable
  private val usr = TableQuery[UserTable]
  import productRepository.ProductTable
  private val prd = TableQuery[ProductTable]

  private val cart = TableQuery[CartTable]

  def create(user: Int, product: Long, count: Int): Future[Cart] = db.run {
    (cart.map(o => (o.user, o.product, o.count))
      returning cart.map(_.id)
      into {case ((user,product,count),id) => Cart(id, user, product, count)}
      ) += (user, product, count)
  }

  def list(): Future[Seq[Cart]] = db.run {
    cart.result
  }

  def delete(id: Int): Future[Unit] = db.run(cart.filter(_.id === id).delete).map(_ => ())

  def update(id: Int, new_cart: Cart): Future[Unit] = {
    val cartToUpdate: Cart = new_cart.copy(id)
    db.run(cart.filter(_.id === id).update(cartToUpdate)).map(_ => ())
  }
}