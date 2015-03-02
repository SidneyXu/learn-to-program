package org.mrseasons.coffeetime.scala._19_high_order_function

import java.awt.event.{ActionListener, ActionEvent}
import javax.swing.JButton

import scala.math._

/**
 * Created by mrseasons on 3/2/15.
 */
object HighOrderExample {

  def main(args: Array[String]) {
    //function as value
    val f = ceil _
    println(f(3.14)) //4.0

    //anonymous function
    var triple = (x: Double) => 3 * x
    println(triple(2)) //6.0

    val arr = Array(1, 2, 3)
    arr.map((x: Int) => 3 * x)
    println(arr(1)) //2

    //parameters type inference
    triple = ((x) => 3 * x)
    triple = (x => 3 * x)
    triple = (3 * _)

    //high-order function
    val x = add((x: Int) => 2)
    println(x) //2

    val m = mulBy(5)
    println(m(0.3)) //1.5

    //curry
    println(mulBy(10)(0.2)) //2.0
    println(mul(10)(0.3)) //3.0

    //control abstract
    runThread(() => println("Hi"))
    runThread2(print("Hello"))
  }

  def add(f: (Int) => Int) = f(10)

  //closure and curry
  def mulBy(factor: Double) = (x: Double) => x * factor

  def mul(factor: Double)(x: Double) = x * factor

  //control abstract
  def runThread(block: () => Unit): Unit = {
    new Thread {
      new Runnable {
        override def run(): Unit = block()
      }
    }.start()
  }

  def runThread2(block: => Unit) {
    new Thread {
      new Runnable {
        override def run() {
          block
        }
      }
    }.start()
  }
}
