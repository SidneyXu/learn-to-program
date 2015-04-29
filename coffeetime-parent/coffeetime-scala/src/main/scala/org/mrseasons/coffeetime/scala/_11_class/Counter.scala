package org.mrseasons.coffeetime.scala._12_class

/**
 * Created by mrseasons on 2015/2/12.
 */
class Counter {
  private var value = 0

  //default public
  def increment(): Unit = {
    value += 1
  }

  def current = value
}
