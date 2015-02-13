package org.mrseasons.coffeetime.scala._13_object

/**
 * Created by mrseasons on 2/13/15.
 */
object TrafficExample {

  def main(args: Array[String]) {
    var red = TrafficColor.RED
    println(red)

    red = TrafficColor(0)
    println(red)

    red = TrafficColor.withName("stop")
    println(red)

    println(red.toString)
    println(red.id)
  }
}
