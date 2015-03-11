package org.mrseasons.coffeetime.scala._16_case_class_match_pattern

/**
 * Created by mrseasons on 3/11/15.
 */
object MatchExample {

  def main(args: Array[String]): Unit = {

  }

  def matchValue: Unit = {
    val times = 1
    val result01 = times match {
      case 1 => "one"
      case 2 => "two"
      case _ => "other"
    }
    println(result01) //one

    val result02 = times match {
      case i if i == 1 => "one"
      case i if 1 == 2 => "two"
      case _ => "other"
    }
    println(result02) //one
  }

  def matchType(o: Any): Any = {
    o match {
      case i: Int if i <= 0 => i - 1
      case i: Int => i + 1
      case d: Double if d < 0.0 => d - 0.1
      case d: Double => d + 0.1
      case str: String => "str is " + str
      case _ => "other"
    }
  }
}
