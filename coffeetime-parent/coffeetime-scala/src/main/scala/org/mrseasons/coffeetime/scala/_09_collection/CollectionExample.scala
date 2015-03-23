package org.mrseasons.coffeetime.scala._09_collection

/**
 * Created by mrseasons on 3/3/15.
 */
object CollectionExample {

  def main(args: Array[String]) {
    var digits = List(1, 2, 3)
    println(digits) //List(1, 2, 3)

    //Basic Operations
    println(digits.head) //1
    println(digits.tail) //List(2, 3)
    println(digits.tail.head) //2
    println(digits.sum) //6

    val empty = List()
    println(empty == Nil) //true

    //List constructors
    //A :: B :: C is interpreted as A :: (B :: C)
    val newDigits = 5 :: digits
    println(digits) //List(1, 2)
    println(newDigits) //List(5, 1, 2)

    //List Pattern
    //In fact, :: is defined as a case class
    def isort(xs: List[Int]): List[Int] = xs match {
      case List() => List()
      case x :: xs1 => {
        println("x", x, xs1);
        insert(x, isort(xs1))
      }
    }
    def insert(x: Int, xs: List[Int]): List[Int] = xs match {
      case List() => List(x)
      case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
    }
    val numbers = List(9, 5, 1, 3)
    val newNumbers = isort(numbers)
    println("newNumbers", newNumbers) //(newNumbers,List(1, 3, 5, 9))


    val list = scala.collection.mutable.MutableList


  }
}
