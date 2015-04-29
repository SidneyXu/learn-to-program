package org.mrseasons.coffeetime.scala._12_class

/**
 * Created by mrseasons on 2015/2/13.
 */
object OutterExample {

  def main(args: Array[String]) {
    //construct instance of inner class
    val outter1 = new Outter
    val outter2 = new Outter
    val inner1 = new outter1.Inner("Outter1")
    val inner2 = new outter2.Inner("Outter2")
    println(inner1.getClass)
    println(inner2.getClass)
    println(inner1.desc)
    println(inner2.desc)

    val outter1Member = outter1.join("Outter1Member")
    val outter2Member = outter2.join("Outter2Member")
    //    outter1Member.contacts+=outter2Member   type mismatch

    val outter = new Outter2
    val inner = new outter.Inner2("Outter")
    println(inner.getClass)
    println(inner.desc)
  }
}
