package org.mrseasons.coffeetime.scala._18_tuple_function

/**
 * Created by mrseasons on 3/20/15.
 */
object TupleExample {

  def main(args: Array[String]) {
    val xy = divmod(7, 2)
    println(xy) //(3,1)
    println(xy._1, xy._2) //(3,1)

    //match m,n
    divmod(7, 2) match {
      case Tuple2(m, n) => println("match m,n")
    }

    //match i,j
    divmod(7, 2) match {
      case (i, j) => println("match i,j")
    }

    //match x,y
    divmod2(7, 2) match {
      case (x, y) => println("match x,y")
    }

    //Tuplen has n arguments
    val xyz = (1, 2, 3)
    println(xyz) //(1,2,3)
    println(xyz.getClass) //class scala.Tuple3
  }

  def divmod(x: Int, y: Int) = new Tuple2[Int, Int](x / y, x % y)

  def divmod2(x: Int, y: Int) = (x / y, x % y)
}
