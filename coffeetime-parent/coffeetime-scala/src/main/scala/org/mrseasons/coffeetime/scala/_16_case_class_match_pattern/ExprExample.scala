package org.mrseasons.coffeetime.scala._16_case_class_match_pattern

/**
 * Created by mrseasons on 2015/05/06.
 */
object ExprExample {

  def main(args: Array[String]) {
    //case class
    val result = Sum(Sum(Number(1), Number(2)), Number(3))

    //toString
    println(result) //Sum(Sum(Number(1),Number(2)),Number(3))

    //equals
    println((Sum(Number(1), Number(2)) == Sum(Number(1), Number(2)))) //true

    //toString() not contains the fields that not belong to constructor
    val n1 = Number(1)
    val n2 = Number(2)
    n1.comment = "a"
    n2.comment = "b"
    println(n1 == n2)

    val num = Number(1)
    println(num.n) //1

    val sum = Sum(Number(3), Number(4))
    println(sum.e1, sum.e2) //(Number(3),Number(4))
    println(sum) //Sum(Number(3),Number(4))

  }
}
