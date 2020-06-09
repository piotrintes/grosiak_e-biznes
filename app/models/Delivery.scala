package models
import play.api.libs.json._

case class Delivery(id: Int, transaction: Int, date: String)

object Delivery {
  implicit val deliveryFormat = Json.format[Delivery]
}