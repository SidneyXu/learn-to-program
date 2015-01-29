package org.mrseasons.coffeetime.scala.lesson04

/**
 * Created by mrseasons on 1/29/15.
 */
object addTwo extends ((Int) => Int) {
  override def apply(v1: Int): Int = v1 + 1
}
