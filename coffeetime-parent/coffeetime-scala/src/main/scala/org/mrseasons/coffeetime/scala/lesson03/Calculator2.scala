package org.mrseasons.coffeetime.scala.lesson03

/**
 * Created by mrseasons on 1/29/15.
 */
class Calculator2(pBrand: String, price: Int) {

  // properties
  val brand:String=pBrand

  //constructors
  val color: String = if (brand == "TI") {
    "blue"
  } else if (brand == "HP") {
    "black"
  } else {
    "white"
  }

  def this(brand: String) {
    this(brand, 0)
  }

  //method
  def add(m: Int, n: Int): Int = m + n
}