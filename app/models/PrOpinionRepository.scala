package models

import java.util.UUID

import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ ExecutionContext, Future }

@Singleton
class PrOpinionRepository @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  private val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  private class PrOpinionTable(tag: Tag) extends Table[PrOpinion](tag, "prOpinion") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def user = column[Int]("user")
    def product: Rep[Long] = column[Long]("product")
    def stars: Rep[Int] = column[Int]("stars")
    def text: Rep[String] = column[String]("text")
    def * = (id, user, product, stars, text) <> ((PrOpinion.apply _).tupled, PrOpinion.unapply)
  }

  private val opinion = TableQuery[PrOpinionTable]

  def create(user: Int, product: Long, stars: Int, text: String): Future[PrOpinion] = db.run {
    (opinion.map(o => (o.user, o.product, o.stars, o.text))
      returning opinion.map(_.id)
      into { case ((user, product, stars, text), id) => PrOpinion(id, user, product, stars, text) }
    ) += (user, product, stars, text)
  }

  def list(product_id: Long): Future[Seq[PrOpinion]] = db.run {
    opinion.filter(_.product === product_id).result
  }

  def delete(id: Int): Future[Unit] = db.run(opinion.filter(_.id === id).delete).map(_ => ())

  def update(id: Int, new_opinion: PrOpinion): Future[Unit] = {
    val opinionToUpdate: PrOpinion = new_opinion.copy(id)
    db.run(opinion.filter(_.id === id).update(opinionToUpdate)).map(_ => ())
  }

  def getById(id: Int): Future[PrOpinion] = db.run {
    opinion.filter(_.id === id).result.head
  }

  def getByIdOption(id: Int): Future[Option[PrOpinion]] = db.run {
    opinion.filter(_.id === id).result.headOption
  }
}

