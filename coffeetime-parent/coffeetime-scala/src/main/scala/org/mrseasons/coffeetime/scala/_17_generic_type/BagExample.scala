package org.mrseasons.coffeetime.scala._17_generic_type

/**
 * Created by mrseasons on 3/12/15.
 */
object BagExample {

  def main(args: Array[String]) {
    val s = new EmptyBag[Num].incl(Num(1.0)).incl(Num(2.0))
    println(s.contains(Num(1.5))) //false
    println(s.contains(Num(1.0))) //true

    // [java.io.File] do not conform to class EmptyBag's type parameter bounds [A <: Ordered[A]]
    //    val ss=new EmptyBag[File]

    //upper bounds is <:
    //lower bounds is >:
  }
}
