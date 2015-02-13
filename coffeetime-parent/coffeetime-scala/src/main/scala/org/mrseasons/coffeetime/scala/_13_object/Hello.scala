package org.mrseasons.coffeetime.scala._13_object

/**
 * Created by mrseasons on 2/13/15.
 */
object Hello extends App {

  println("Hello World")

  if (args.length > 0) {
    println("args:" + args(0))
  } else {
    println("no args")
  }
}
