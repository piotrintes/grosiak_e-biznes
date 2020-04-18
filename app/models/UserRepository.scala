package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class UserRepository @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class UserTable(tag: Tag) extends Table[User](tag, "user") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def name = column[String]("name")
    def surname: Rep[String] = column[String]("surname")
    def email: Rep[String] = column[String]("email")
    def admin: Rep[Boolean] = column[Boolean]("admin")
    def * = (id, name, surname, email, admin) <> ((User.apply _).tupled, User.unapply)
  }

  val user = TableQuery[UserTable]

  def create(name: String, surname: String, email: String, admin: Boolean): Future[User] = db.run {
    (user.map(u => (u.name, u.surname,u.email, u.admin))
      returning user.map(_.id)
      into {case ((name,surname,email,admin),id) => User(id, name, surname, email, admin)}
      ) += (name, surname, email, admin)
  }

  def list(): Future[Seq[User]] = db.run {
    user.result
  }
}

