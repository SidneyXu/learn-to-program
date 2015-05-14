package org.mrseasons.coffeetime.scala._22_xml_json

/**
 * Created by mrseasons on 2015/05/14.
 */
class Stock(var symbol: String, var businessName: String, var price: Double) {

  // (a) convert Stock fields to XML
  def toXml = {
    <stock>
      <symbol>{symbol}</symbol>
      <businessName>{businessName}</businessName>
      <price>{price}</price>
    </stock>
  }

  override def toString =
    s"symbol: $symbol, businessName: $businessName, price: $price"

}

object Stock {

  // (b) convert XML to a Stock
  def fromXml(node: scala.xml.Node):Stock = {
    val symbol = (node \ "symbol").text
    val businessName = (node \ "businessName").text
    val price = (node \ "price").text.toDouble
    new Stock(symbol, businessName, price)
  }

}