package org.mrseasons.coffeetime.scala._09_collection

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
 * Created by mrseasons on 2015/3/3.
 */
object CollectionExample {

  def main(args: Array[String]) {
    //Define
    val digits = List(1, 2, 3)
    println(digits) //List(1, 2, 3)


    //Empty List
    val empty = List()
    println(empty == Nil) //true


    //List constructors
    //A :: B :: C is interpreted as A :: (B :: C)
    val newDigits = 5 :: digits
    println(digits) //List(1, 2)
    println(newDigits) //List(5, 1, 2)
    //error
    //    val newDigits2= digits :: 5


    //Basic Operations
    println(digits.head) //1
    println(digits.tail) //List(2, 3)
    println(digits.tail.head) //2
    println(digits.sum) //6

    //List Case Pattern
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


    //MutableList
    //works internally with LinkedList
    var list = new mutable.MutableList[Int]
    list +=(2, 3, 5)
    println(list(1))

    //ListBuffer
    //uses internally Nil and :: to build an immutable List
    var listBuffer = new ListBuffer[Int]
    listBuffer +=(2, 3, 5)
    println(listBuffer(1))

    //zip
    var resultList = list.zip(listBuffer)
    println(resultList, resultList.getClass) //  (MutableList((2,2), (3,3), (5,5)),class scala.collection.mutable.MutableList)

    //flatten
    var list2 = List(List(1, 2), List(3, 4))
    var result = list2.flatten
    println(result, result.getClass) //  (List(1, 2, 3, 4),class scala.collection.immutable.$colon$colon)

    //Set
    var set = mutable.HashSet(1, 2, 3)
    set +=(3, 4, 5)
    println(set) //  Set(1, 5, 2, 3, 4)
  }
}
