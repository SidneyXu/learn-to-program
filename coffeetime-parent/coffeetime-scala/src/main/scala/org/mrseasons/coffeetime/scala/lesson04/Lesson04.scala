package org.mrseasons.coffeetime.scala.lesson04

import org.mrseasons.coffeetime.scala.lesson03.Calculator

/**
 * Created by mrseasons on 1/29/15.
 */
object Lesson04 {

  def main(args: Array[String]): Unit = {
    matchTryCatchFaceExp
  }

  //index out of boundfinish
  def matchTryCatchFaceExp: Unit = {
    val result: Unit = try {
      throw new IndexOutOfBoundsException
    } catch {
      case e: NullPointerException => println("null object")
      case e: IndexOutOfBoundsException => print("index out of bound")
    } finally {
      println("finish")
    }
  }

  //  null object
  //  finish
  def matchTryCatch: Unit = {
    try {
      throw new NullPointerException
    } catch {
      case e: NullPointerException => println("null object")
      case e: IndexOutOfBoundsException => print("index out of bound")
    } finally {
      println("finish")
    }
  }


}
