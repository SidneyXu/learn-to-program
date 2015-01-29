package org.mrseasons.coffeetime.scala.lesson03

/**
 * Created by mrseasons on 1/29/15.
 */
  class Circle(r: Int) extends Shape {
    override def getArea(): Int = {
      r * r * 3
    }

  override def getName(): String = "Circle"
}
