package org.mrseasons.coffeetime.scala._28_implict_dsl

/**
 * Created by mrseasons on 3/27/15.
 */
abstract class SemiGroup2[A] {
  def add(x: A, y: A): A

  def >(a: A): Boolean = true
}

abstract class Monoid2[A] extends SemiGroup2[A] {
  def unit: A
}

object SemiGroup {

  implicit val stringMonoid = new Monoid2[String] {
    def add(x: String, y: String): String = x.concat(y)

    def unit: String = ""
  }

  implicit val intMonoid = new Monoid2[Int] {
    def add(x: Int, y: Int): Int = x + y

    def unit: Int = 0
  }

  def main(args: Array[String]) {
    println(sum(List("a", "bc", "def"))(stringMonoid))
    sum(List(1, 2, 3))(intMonoid)

    println(sum(List("a", "bc", "def")))


  }

  def acquire[A](x: A)(a: Monoid2[A]): A = {
    if (a > x) {
      x
    } else x

  }

  def sum[A](xs: List[A])(implicit m: Monoid2[A]): A = if (xs.isEmpty) m.unit
  else m.add(xs.head, sum(xs.tail))


  implicit def int2ordered(x: Int): Ordered[Int] = new Ordered[Int] {
    def compare(y: Int): Int =
      if (x < y) -1 else if (x > y) 1 else 0
  }

}

