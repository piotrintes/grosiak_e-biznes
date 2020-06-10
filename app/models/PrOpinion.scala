package models
import java.util.UUID

import play.api.libs.json._

case class PrOpinion(id: Int, user: Int, product: Long, stars: Int, text: String)

object PrOpinion {
  implicit val prOpinionFormat = Json.format[PrOpinion]
}