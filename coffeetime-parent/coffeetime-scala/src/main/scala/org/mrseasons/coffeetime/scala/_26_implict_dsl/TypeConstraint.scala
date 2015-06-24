package org.mrseasons.coffeetime.scala._26_implict_dsl

/**
 * Created by mrseasons on 2015/06/16.
 */
object TypeConstraint extends App {

  //  A <:< Z
  //  check type of A is a sub type of Z
  def f1[A](a: A)(implicit ev: A <:< T): Unit = {
    println("f1", a.getClass)
  }

  //  A =:= Z
  // check type of A equals to type of Z
  def f2[A](a: A)(implicit ev: A =:= T): Unit = {
    println("f2", a.getClass)
  }


  val t = new T
  val t2 = new T2

  f1(t)
  f1(t2)
  f2(t)

  //  f2(t2)  wrong

  class T {}

  class T2 extends T {}

}

