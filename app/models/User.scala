package models
import play.api.libs.json._

case class User(id: Int, usrName: String, name: String, surname: String, email: String, admin: Boolean)

object User {
  implicit val userFormat = Json.format[User]
}



