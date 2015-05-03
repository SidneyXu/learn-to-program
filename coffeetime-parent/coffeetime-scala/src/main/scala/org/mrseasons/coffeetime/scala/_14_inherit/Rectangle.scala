package org.mrseasons.coffeetime.scala._14_inherit

/**
 * Created by mrseasons on 2015/05/01.
 */
class Rectangle(name: String) extends Shape(name) {
  override val int: Int = 20

  //override abstract method
  def height: Int = ???

  def width: Int = ???
}
