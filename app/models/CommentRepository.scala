package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class CommentRepository @Inject()(dbConfigProvider: DatabaseConfigProvider, userRepository: UserRepository)(implicit ec: ExecutionContext) {
  private val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  private class CommentTable(tag: Tag) extends Table[Comment](tag, "comment") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def user = column[Int]("name")
    def stars: Rep[Int] = column[Int]("stars")
    def text: Rep[String] = column[String]("text")
    def user_fk = foreignKey("user_fk",user, usr)(_.id)
    def * = (id, user, stars, text) <> ((Comment.apply _).tupled, Comment.unapply)
  }

  import userRepository.UserTable
  private val usr = TableQuery[UserTable]

  private val comment = TableQuery[CommentTable]

  def create(user: Int, stars: Int, text: String): Future[Comment] = db.run {
    (comment.map(c => (c.user, c.stars, c.text))
      returning comment.map(_.id)
      into {case ((user,stars,text),id) => Comment(id, user, stars, text)}
      ) += (user, stars, text)
  }

  def list(): Future[Seq[Comment]] = db.run {
    comment.result
  }

  def delete(id: Int): Future[Unit] = db.run(comment.filter(_.id === id).delete).map(_ => ())

  def update(id: Int, new_comment: Comment): Future[Unit] = {
    val commentToUpdate: Comment = new_comment.copy(id)
    db.run(comment.filter(_.id === id).update(commentToUpdate)).map(_ => ())
  }
}

