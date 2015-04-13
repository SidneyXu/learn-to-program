package org.mrseasons.coffeetime.scala._04_operator_apply

import scala.collection.mutable
import scala.util.matching.Regex

/**
 * Created by mrseasons on 2/25/15.
 */
object OperatorExample {

  def main(args: Array[String]) {
    //Identifier
    val ! = 1
//    val `val` = 2

    //Infix Operator
    1 to 10
    1.to(10)
    1 -> 10
    1.->(10)
//    1 + 10
//    1.+(10)

    //Unary Operator
//    1 toString

//    1.toString()

//    -1
//    1.unary_-

    //apply and update
    val obj = OperatorExample(1, 2)
    println(obj) //1+2
    OperatorExample(2, 3) = 4 //(2,3,4)

    val scores = new mutable.HashMap[String, Int]()
    scores("Bob") = 100 //actually invoke scores.update("Bob,100)
    val bob = scores("Bob") //actually invoke scores.apply("Bob")

    //unapply
    val OperatorExample(a, b) = OperatorExample(1, 2)
    println()
    val result = obj match {
      case OperatorExample(1, 2) => "one"
      case OperatorExample(a, b) => a + "," + b
      case _ => "other"
    }
    println(result) //10,20

    //unapply in regex
    "user@domain.com" match {
      case Email(user, domain) => println(user + "@" + domain)
    }
  }

  def apply(x: Int, y: Int) = new OperatorExample(x, y)

  def update(x: Int, y: Int, z: Int) = println(x, y, z)

  //use to extract value or return boolean
  def unapply(input: OperatorExample) = {
    if (input.x < 0)
      None
    else
      Some(input.x * 10, input.y * 10)
  }

}

class OperatorExample(var x: Int, var y: Int) {
  override def toString: String = x + "+" + y;
}

object Email {
  def unapply(str: String) = new Regex("""(.*)@(.*)""")
    .unapplySeq(str).get match {
    case user :: domain :: Nil => Some(user, domain)
    case _ => None
  }
}