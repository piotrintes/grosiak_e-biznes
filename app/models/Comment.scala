package models
import play.api.libs.json._

case class Comment(id: Int, user: Int, stars: Int, text: String)

object Comment {
  implicit val commentFormat = Json.format[Comment]
}