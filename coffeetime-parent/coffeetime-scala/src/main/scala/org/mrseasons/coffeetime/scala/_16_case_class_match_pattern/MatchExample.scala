package org.mrseasons.coffeetime.scala._16_case_class_match_pattern

/**
 * Created by mrseasons on 2015/05/06.
 */
object MatchExample {

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

  //match pattern in try catch
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

  def matchCaseClass: Unit = {
    def eval(e: Expr): Int = e match {
      case Number(n) => n
      case Sum(l, r) => eval(l) + eval(r)
      case x => x.eval * 10
    }
    println(eval(Sum(Number(1), Number(2)))) //3
    println(eval(new Expr {
      override def eval: Int = 20
    })) //200
  }

}
