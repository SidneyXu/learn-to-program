package org.mrseasons.coffeetime.scala._09_collection

/**
 * Created by mrseasons on 3/3/15.
 */
object CollectionExample {

  def main(args: Array[String]) {
    var digits=List(1,2)
    println(digits) //List(1, 2)
    println(digits.head)  //1
    println(digits.tail)  //List(2)
    println(digits.tail.head) //2

    val empty=List()
    println(empty==Nil) //true

    digits=5::digits
    println(digits) //List(5, 1, 2)
    println(digits.head)  //5
    println(digits.tail)  //List(1, 2)
    println(digits.tail.head) //1

    println(digits.sum) //8

    val list=scala.collection.mutable.MutableList


  }
}
