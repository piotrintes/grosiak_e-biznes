package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class CommentRepository @Inject()(dbConfigProvider: DatabaseConfigProvider, userRepository: UserRepository)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class CommentTable(tag: Tag) extends Table[Comment](tag, "comment") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def user = column[Int]("name")
    def stars: Rep[Int] = column[Int]("stars")
    def text: Rep[String] = column[String]("text")
    def user_fk = foreignKey("user_fk",user, usr)(_.id)
    def * = (id, user, stars, text) <> ((Comment.apply _).tupled, Comment.unapply)
  }

  import userRepository.UserTable
  val usr = TableQuery[UserTable]

  val comment = TableQuery[CommentTable]

  def create(user: Int, stars: Int, text: String): Future[Comment] = db.run {
    (comment.map(c => (c.user, c.stars, c.text))
      returning comment.map(_.id)
      into {case ((user,stars,text),id) => Comment(id, user, stars, text)}
      ) += (user, stars, text)
  }

  def list(): Future[Seq[Comment]] = db.run {
    comment.result
  }
}

