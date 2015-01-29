package org.mrseasons.coffeetime.scala.lesson03

/**
 * Created by mrseasons on 1/29/15.
 */
object Lesson03 {

  def main(args: Array[String]): Unit = {
    methodAndFunction
  }

  def defaultConstructor: Unit = {
    val calc = new Calculator
    println(calc.add(1, 2))
    println(calc.brand)
  }

  def useConstructor: Unit = {
    val calc01 = new Calculator2("HP")
    println(calc01.add(1, 2)) //3
    println(calc01.brand) //HP
    println(calc01.color) //black
  }

  def methodAndFunction: Unit = {
    val c = new C
    println(c.methodInc) //()
    println(c.acc) //1

    println(c.functionInc) //<function0>
    println(c.acc) //1

    println(c.functionInc()) //()
    println(c.acc) //2

  }

}
