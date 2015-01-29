package org.mrseasons.coffeetime.scala.lesson04

import org.mrseasons.coffeetime.scala.lesson03.Calculator

/**
 * Created by mrseasons on 1/29/15.
 */
object Lesson04 {

  def main(args: Array[String]) {
    caseClass
  }

  def usingApply: Unit = {
    val foo = FooMaker

    val bar = new Bar
    println(bar()) //0
  }

  def matchValue: Unit = {
    val times = 1
    val result01 = times match {
      case 1 => "one"
      case 2 => "two"
      case _ => "other"
    }
    println(result01) //one

    val result02 = times match {
      case i if i == 1 => "one"
      case i if 1 == 2 => "two"
      case _ => "other"
    }
    println(result02) //one
  }

  def matchType(o: Any): Any = {
    o match {
      case i: Int if i <= 0 => i - 1
      case i: Int => i + 1
      case d: Double if d < 0.0 => d - 0.1
      case d: Double => d + 0.1
      case str: String => "str is " + str
      case _ => "other"
    }
  }

  def terribleMatchClass(calc: Calculator) = calc match {
    case _ if calc.brand == "HP" && calc.modle == "20B" => "hp20"
    case _ if calc.brand == "HP" && calc.modle == "10B" => "hp10"
    case _ if calc.brand == "TI" => "ti"
    case _ => "other"
  }

  def caseClass: Unit = {
    val hp20a = CaseCaculator("HP", "20B")
    val hp20b = CaseCaculator("HP", "20B")
    val hp10 = CaseCaculator("HP", "10B")
    println(hp20a) //CaseCaculator(HP,20B)
    println(hp20a == hp20b) //true
    hp20a.price = 10
    hp20b.price = 20
    println(hp20a) //CaseCaculator(HP,20B)
    println(hp20a == hp20b) //true
  }

  def matchCaseClass(calc: CaseCaculator) = calc match {
    case CaseCaculator("HP", "20B") => "hp20"
    case CaseCaculator("HP", "10B") => "hp10"
    case _ => "other"
  }

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


}
