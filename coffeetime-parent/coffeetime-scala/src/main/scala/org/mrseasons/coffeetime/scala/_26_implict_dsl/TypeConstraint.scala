package org.mrseasons.coffeetime.scala._26_implict_dsl

/**
 * Created by mrseasons on 2015/06/16.
 */
object TypeConstraint extends App {

  //  A <:< Z
  //  check type of A is a sub type of Z
  def f1[A](a: A)(implicit ev: A <:< Z): Unit = {
    println("f1")
  }

  //  A =:= Z
  // check type of A equals to type of Z
  def f2[A](a: A)(implicit ev: A =:= Z): Unit = {
    println("f2", a.getClass)
  }

  implicit def t1ToZ(t: T1): Z = new Z

  implicit val a: T1 = new T1

  val t1 = new T1

  //  f1(t1)
  //  f1("x")

  f2(t1)

}

class Z {}

class T1 {}