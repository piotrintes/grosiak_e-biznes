/*package models

import java.util.UUID

import com.mohiva.play.silhouette.api.LoginInfo
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
    def userID = column[UUID]("userID", O.PrimaryKey, O.AutoInc)
    def loginInfo = column[String]("loginInfo")
    def firstName = column[String]("firstName")
    def lastName = column[String]("lastName")
    def fullName: Rep[String] = column[String]("fullName")
    def email: Rep[String] = column[String]("email")
    def avatarURL: Rep[String] = column[String]("avatarURL")
    def activated: Rep[Boolean] = column[Boolean]("activated")
    def * = (
      Some(userID),
      Some(loginInfo),
      Some(firstName),
      Some(lastName),
      Some(fullName),
      Some(email),
      Some(avatarURL),
      Some(activated)
    ) <> ((User.apply _).tupled, User.unapply)
  }


  val user = TableQuery[UserTable]

  def create(loginInfo: LoginInfo, firstName: String, lastName: String, fullName: String, email: String, avatarURL: String, activated: Boolean): Future[User] = db.run {
    (user.map(u => (u.loginInfo, u.firstName, u.lastName,u.fullName, u.email, u.avatarURL, u.activated))
      returning user.map(_.userID)
      into {case ((loginInfo, firstName,lastName,fullName,email,avatarURL,activated),userID) => User(userID, loginInfo, firstName,lastName,fullName,email,avatarURL,activated)}
      ) += (loginInfo, firstName,lastName,fullName,email,avatarURL,activated)
  }

  def list(): Future[Seq[User]] = db.run {
    user.result
  }

  def delete(id: UUID): Future[Unit] = db.run(user.filter(_.id === id).delete).map(_ => ())

  def update(id: UUID, new_user: User): Future[Unit] = {
    val userToUpdate: User = new_user.copy(id)
    db.run(user.filter(_.id === id).update(userToUpdate)).map(_ => ())
  }

  def getById(id: UUID): Future[User] = db.run {
    user.filter(_.id === id).result.head
  }

  def getByIdOption(id: UUID): Future[Option[User]] = db.run {
    user.filter(_.id === id).result.headOption
  }
}

*/ 