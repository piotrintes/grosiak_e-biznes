package models

case class Transaction(id: Int, user: Int, product: Long, count: Int, price: Double, date: String)