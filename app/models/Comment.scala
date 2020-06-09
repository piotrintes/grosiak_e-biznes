package models
import java.util.UUID

import play.api.libs.json._

case class Comment(id: Int, user: UUID, stars: Int, text: String)

object Comment {
  implicit val commentFormat = Json.format[Comment]
}