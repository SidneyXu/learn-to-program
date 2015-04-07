package org.mrseasons.coffeetime.scala._12_class

/**
 * Created by mrseasons on 4/7/15.
 */
object MethodExample {

  def main(args: Array[String]) {
    val c = new C
    println(c.methodInc) //()
    println(c.acc) //1

    println(c.functionInc) //<function0>
    println(c.acc) //1

    println(c.functionInc()) //()
    println(c.acc) //2
  }

  class C {
    var acc = 0

    // a method
    def methodInc = {
      acc += 1
    }

    // a function, return value is a function
    def functionInc = { () => acc += 1 }
  }

}
