package org.mrseasons.coffeetime.scala._16_case_class_match_pattern

/**
 * Created by mrseasons on 3/11/15.
 */
object ExprExample {

  def main(args: Array[String]) {
    val result = Sum(Sum(Number(1), Number(2)), Number(3))
    println(result) //Sum(Sum(Number(1),Number(2)),Number(3))

    println((Sum(Number(1), Number(2)) == Sum(Number(1), Number(2)))) //true
    val n1=Number(1)
    val n2=Number(2)
    n1.comment="a"
    n2.comment="b"
    println(n1==n2)

    val num = Number(1)
    println(num.n) //1

    val sum = Sum(Number(3), Number(4))
    println(sum.e1, sum.e2) //(Number(3),Number(4))
    println(sum) //Sum(Number(3),Number(4))


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
}
