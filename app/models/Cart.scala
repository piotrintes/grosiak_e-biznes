package models
import play.api.libs.json._

case class Cart(id: Int, user: Int, product: Long, count: Int)

object Cart {
  implicit val cartFormat = Json.format[Cart]
}