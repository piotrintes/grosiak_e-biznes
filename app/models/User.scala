package models
import java.util.UUID

import com.mohiva.play.silhouette.api.{Identity, LoginInfo}
import play.api.libs.json._

case class User(
                 id: UUID,
                 loginInfo: LoginInfo,
                 usrName: Option[String],
                 name: Option[String],
                 surname: Option[String],
                 email: Option[String],
                 admin: Boolean) extends Identity {

  object User {
    implicit val categoryFormat = Json.format[User]
  }
}

object User {
  implicit val userFormat = Json.format[User]
}
