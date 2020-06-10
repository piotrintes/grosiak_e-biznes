package models
import java.util.UUID

import play.api.libs.json._

case class Transaction(id: Int, user: Int, product: Long, count: Int, price: Double, date: String)

object Transaction {
  implicit val transactionFormat = Json.format[Transaction]
}