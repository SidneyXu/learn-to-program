package org.mrseasons.coffeetime.scala._28_implict_dsl

import java.text.SimpleDateFormat
import java.util.Date

/**
 * Created by mrseasons on 2015/05/20.
 */
object ImplicitExample {

  def main(args: Array[String]) {

    //implicit conversation
    implicit def strToDate(str: String): Date =
      new SimpleDateFormat("yyyy-MM-dd").parse(str)

    println("2013-01-01 unix time: " + "2013-01-01".getTime / 1000l) //2013-01-01 unix time: 1356969600

    //  add functions for current libraries
    //  Int 3 is implicitly converted into SuperInt
    import Context._
    println(3.triple) //  27

    //  implicit parameters
    implicit val x: String = "Hello"
    print(" World") //  Hello World
    print(" Bye")("Good") //  Good Bye

    //  Wrong, ambiguous implicit values
    //    implicit val y: String = "Welcome"
    //    print(" World")

    //  implicit class
    println(1.add2) //  3
  }

}

//  implicit conversation
object Context {
  implicit def int2SuperInt(a: Int): SuperInt = new SuperInt(a)

  //  implicit parameters
  def print(str: String)(implicit prefix: String) = {
    println(prefix + " " + str)
  }

  //  implicit class
  implicit class A(a: Int) {
    def add2 = a + 2
  }

}

class SuperInt(val a: Int) {
  def triple = a * a * a
}
