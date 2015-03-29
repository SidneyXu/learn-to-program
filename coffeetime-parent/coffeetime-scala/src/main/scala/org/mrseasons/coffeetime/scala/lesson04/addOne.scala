package org.mrseasons.coffeetime.scala.lesson04

/**
 * Created by mrseasons on 1/29/15.
 */

class addOne extends Function1[Int, Int] {
  override def apply(v1: Int): Int = v1 + 1
}

//from 0 to 22
object addOne extends Function1[Int, Int] {
  def main(args: Array[String]) {
    println(apply(2))

    val plusOne = new addOne()
    println(plusOne.apply(2))
  }

  override def apply(v1: Int): Int = v1 + 1
}
