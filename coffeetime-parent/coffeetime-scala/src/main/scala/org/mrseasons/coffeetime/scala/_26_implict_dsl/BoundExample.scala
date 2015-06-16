package org.mrseasons.coffeetime.scala._26_implict_dsl

;

/**
 * Created by mrseasons on 2015/06/16.
 */
object BoundExample extends App {

  //  testViewBound
  testContextBound

  def testViewBound: Unit = {
    val t = new T
    f1(t) //  B

    implicit def t2ToB(t: T2): B = new B
    val t2 = new T2
    f1(t2) //  B
  }

  def testContextBound: Unit = {
    implicit
    val c2 = new C2
    f3(c2)
  }

  //  View Bounds
  //  def f1[T](implicit f2: T => A[T]) -> def f1[T <% A[T]]
  //  enable the use of some type A as if it were some type B
  //  In other words, A should have an implicit conversion to B available
  def f1[A <% B](a: A) = a.invokeB

  def f2[A](a: A)(implicit ev1: A => B) = a.invokeB

  //  Context Bounds, type class pattern
  //  def f[T]( implicit a:A[T] )  -> def f[T:A]
  //  def f3[A: C](a: C) = a.invokeC
  def f3[T](implicit a: C[T]) = a.invokeC
}

class B {
  def invokeB = println("B")
}

class T extends B {
}

class T2 {}

class C[A] {
  def invokeC = println("C")
}

class C2 extends C {
}