package org.mrseasons.coffeetime.scala._12_class

/**
 * Created by mrseasons on 2/12/15.
 */
object CounterExample {

  def main(args: Array[String]) {
    val counter = new Counter
    counter.increment()
    println(counter.current)
  }
}
