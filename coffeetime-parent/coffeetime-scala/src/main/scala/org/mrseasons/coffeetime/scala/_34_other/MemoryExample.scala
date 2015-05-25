package org.mrseasons.coffeetime.scala._34_other

import scala.collection.mutable

/**
 * Created by mrseasons on 2015/05/25.
 */
object MemoryExample {

  def main(args: Array[String]) {
    withcache()
  }

  //  102334155
  //  it takes 864ms
  //    102334155
  //  it takes 0ms
  def nocache(): Unit = {
    val cache = new mutable.WeakHashMap[Int, Int]
    def memo(f: Int => Int) = (x: Int) => cache.getOrElseUpdate(x, f(x))

    def fibonacci_(in: Int): Int = in match {
      case 0 => 0;
      case 1 => 1;
      case n: Int => fibonacci_(n - 1) + fibonacci_(n - 2)
    }
    val fibonacci: Int => Int = memo(fibonacci_)

    val t1 = System.currentTimeMillis()
    println(fibonacci(40))
    println("it takes " + (System.currentTimeMillis() - t1) + "ms")

    val t2 = System.currentTimeMillis()
    println(fibonacci(40))
    println("it takes " + (System.currentTimeMillis() - t2) + "ms")
  }

  //  102334155
  //  it takes 164ms
  //    102334155
  //  it takes 0ms
  def withcache(): Unit = {
    val cache = new mutable.WeakHashMap[Int, Int]
    def memo(f: Int => Int) = (x: Int) => cache.getOrElseUpdate(x, f(x))

    def fibonacci_(in: Int): Int = in match {
      case 0 => 0;
      case 1 => 1;
      case n: Int => memo(fibonacci_)(n - 1) + memo(fibonacci_)(n - 2)
    }
    val fibonacci: Int => Int = memo(fibonacci_)

    val t1 = System.currentTimeMillis()
    println(fibonacci(40))
    println("it takes " + (System.currentTimeMillis() - t1) + "ms")

    val t2 = System.currentTimeMillis()
    println(fibonacci(40))
    println("it takes " + (System.currentTimeMillis() - t2) + "ms")
  }
}
