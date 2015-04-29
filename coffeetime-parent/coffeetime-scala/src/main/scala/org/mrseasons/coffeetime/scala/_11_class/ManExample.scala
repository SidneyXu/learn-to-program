package org.mrseasons.coffeetime.scala._12_class

/**
 * Created by mrseasons on 2015/2/12.
 */
object ManExample {

  def main(args: Array[String]) {
    val m1 = new Man("Fred", 21) //main
    val m2 = new Man("Fred") //slave
    val m3 = new Man(21) //slave

    //    val w1=new Woman("Jane",21) main is private
    val w2 = new Woman("Jane")
  }
}
