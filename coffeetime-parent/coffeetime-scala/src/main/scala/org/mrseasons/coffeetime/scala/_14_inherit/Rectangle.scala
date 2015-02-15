package org.mrseasons.coffeetime.scala._14_inherit

/**
 * Created by mrseasons on 2/15/15.
 */
class Rectangle(name: String) extends Shape(name) {
  //override abstract method
  def height: Int = ???

  def width: Int = ???

  override val int: Int = 20
}
