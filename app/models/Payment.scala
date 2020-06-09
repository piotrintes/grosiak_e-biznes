package models
import play.api.libs.json._

case class Payment(id: Int, transaction: Int, date: String)

object Payment {
  implicit val paymentFormat = Json.format[Payment]
}