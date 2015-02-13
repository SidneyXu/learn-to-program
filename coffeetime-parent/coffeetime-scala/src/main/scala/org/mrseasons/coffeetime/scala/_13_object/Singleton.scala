package org.mrseasons.coffeetime.scala._13_object

/**
 * Created by mrseasons on 2/13/15.
 */
object Singleton {
  private var num = 0

  def sequence() = {
    num += 1
    num
  }

  def main(args: Array[String]) {
    println(Singleton.sequence())
    println(Singleton.sequence())
    println(Singleton.sequence())
  }

}
