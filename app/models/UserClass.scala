package models
import play.api.libs.json._

case class UserClass(id: Int, providerId: String, userKey: String, usrName: String, name: String, surname: String, email: String, admin: Boolean)

object UserClass {
  implicit val userFormat = Json.format[UserClass]
}