package models

import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ ExecutionContext, Future }

@Singleton
class PromotionRepository @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  private val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  private class PromotionTable(tag: Tag) extends Table[Promotion](tag, "promotion") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def product: Rep[Long] = column[Long]("product")
    def discount: Rep[Int] = column[Int]("discount")
    def * = (id, product, discount) <> ((Promotion.apply _).tupled, Promotion.unapply)
  }

  private val promotion = TableQuery[PromotionTable]

  def create(product: Long, discount: Int): Future[Promotion] = db.run {
    (promotion.map(t => (t.product, t.discount))
      returning promotion.map(_.id)
      into { case ((product, discount), id) => Promotion(id, product, discount) }
    ) += (product, discount)
  }

  def list(): Future[Seq[Promotion]] = db.run {
    promotion.result
  }

  def delete(id: Int): Future[Unit] = db.run(promotion.filter(_.id === id).delete).map(_ => ())

  def update(id: Int, new_promotion: Promotion): Future[Unit] = {
    val promotionToUpdate: Promotion = new_promotion.copy(id)
    db.run(promotion.filter(_.id === id).update(promotionToUpdate)).map(_ => ())
  }

  def getById(id: Int): Future[Promotion] = db.run {
    promotion.filter(_.id === id).result.head
  }

  def getByProductId(id: Long): Future[Option[Promotion]] = db.run {
    promotion.filter(_.product === id).result.headOption
  }

  def getByIdOption(id: Int): Future[Option[Promotion]] = db.run {
    promotion.filter(_.id === id).result.headOption
  }
}

