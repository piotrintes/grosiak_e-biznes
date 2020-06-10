package models

import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ ExecutionContext, Future }

@Singleton
class UserClassRepository @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class UserTable(tag: Tag) extends Table[UserClass](tag, "user") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def providerId = column[String]("providerID")
    def userKey = column[String]("userKey")
    def usrName = column[String]("usrName")
    def name = column[String]("name")
    def surname: Rep[String] = column[String]("surname")
    def email: Rep[String] = column[String]("email")
    def admin: Rep[Boolean] = column[Boolean]("admin")
    def * = (id, providerId, userKey, usrName, name, surname, email, admin) <> ((UserClass.apply _).tupled, UserClass.unapply)
  }

  val user = TableQuery[UserTable]

  def create(providerId: String, userKey: String, usrName: String, name: String, surname: String, email: String, admin: Boolean): Future[UserClass] = db.run {
    (user.map(u => (u.providerId, u.userKey, u.usrName, u.name, u.surname, u.email, u.admin))
      returning user.map(_.id)
      into { case ((providerId, userKey, usrName, name, surname, email, admin), id) => UserClass(id, providerId, userKey, usrName, name, surname, email, admin) }
    ) += (providerId, userKey, usrName, name, surname, email, admin)
  }

  def list(): Future[Seq[UserClass]] = db.run {
    user.result
  }

  def delete(id: Int): Future[Unit] = db.run(user.filter(_.id === id).delete).map(_ => ())

  def update(id: Int, new_user: UserClass): Future[Unit] = {
    val userToUpdate: UserClass = new_user.copy(id)
    db.run(user.filter(_.id === id).update(userToUpdate)).map(_ => ())
  }

  def getById(id: Int): Future[UserClass] = db.run {
    user.filter(_.id === id).result.head
  }

  def getByIdOption(id: Int): Future[Option[UserClass]] = db.run {
    user.filter(_.id === id).result.headOption
  }

  def getByProvider(providerId: String, userKey: String): Future[Option[UserClass]] = {
    dbConfig.db.run(user.filter(_.providerId === providerId).filter(_.userKey === userKey).result.headOption)
  }
}