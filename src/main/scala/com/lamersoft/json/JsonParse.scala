package com.lamersoft.json

import java.util.UUID

import play.api.libs.json._

class JsonParse {
  val json: JsValue = Json.parse(
    """
  {
    "warrantyId" : "fbbe2470-c316-11e9-a20e-e161346c6b1c",
    "sellerName" : "Goparik",
    "customerName" : "Losharik",
    "product" : "hlam"
  }
  """)
  val readableString: String = Json.prettyPrint(json)
  val id = (json \ "warrantyId").as[UUID]
  val seller = (json \ "sellerName").as[String]
  val customer = (json \ "customerName").as[String]
  val product = (json \ "product").as[String]

  val warranty: TestClass = new TestClass(id, seller, customer, product)
  println(warranty.id + " " + warranty.seller + " " + warranty.customer + " " + warranty.product)
}
