package org.mrseasons.coffeetime.scala._12_class

/**
 * Created by mrseasons on 2/12/15.
 */
class Counter {
  private var value = 0

  //default public
  def increment(): Unit = {
    value += 1
  }

  def current = value
}
