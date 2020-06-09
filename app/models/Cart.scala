package models
import java.util.UUID

import play.api.libs.json._

case class Cart(id: Int, user: UUID, product: Long, count: Int)

object Cart {
  implicit val cartFormat = Json.format[Cart]
}