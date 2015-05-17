package org.mrseasons.coffeetime.scala._28_implict_dsl

import java.text.SimpleDateFormat

/**
 * Created by mrseasons on 4/13/15.
 */
object ImplicitExample {

  def main(args: Array[String]) {

    implicit def strToDate(str: String) =
      new SimpleDateFormat("yyyy-MM-dd").parse(str)

    println("2013-01-01 unix time: " + "2013-01-01".getTime() / 1000l) //2013-01-01 unix time: 1356969600

  }
}
