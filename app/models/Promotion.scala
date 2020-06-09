package models
import play.api.libs.json._

case class Promotion(id: Int, product: Long, discount: Int)

object Promotion {
  implicit val promotionFormat = Json.format[Promotion]
}