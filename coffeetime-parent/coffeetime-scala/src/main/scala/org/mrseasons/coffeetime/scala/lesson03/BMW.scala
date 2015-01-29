package org.mrseasons.coffeetime.scala.lesson03

/**
 * Created by mrseasons on 1/29/15.
 */
class BMW extends Car with Shiny {
  //from car
  override val brand: String = "BMW"

  //placeholder
  override val price: Int = 10

  override def run: Unit = {
    println("run")
  }

  //from shiny
  override val shineRefraction: Int = 12
}
