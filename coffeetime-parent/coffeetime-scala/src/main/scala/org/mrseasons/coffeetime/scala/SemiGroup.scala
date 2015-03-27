package org.mrseasons.coffeetime.scala

/**
 * Created by mrseasons on 3/27/15.
 */
abstract class SemiGroup[A] {
  def add(x: A, y: A): A

  def >(a: A) :Boolean =true
}

abstract class Monoid[A] extends SemiGroup[A] {
  def unit: A
}

object intMonoid extends Monoid[Int] {
  def add(x: Int, y: Int): Int = x + y

  def unit: Int = 0
}

object SemiGroup {
  def main(args: Array[String]) {

  }

  def acquire[A](x:A)(a:Monoid[A]): A ={
    if (a>x){x} else x

  }
}

