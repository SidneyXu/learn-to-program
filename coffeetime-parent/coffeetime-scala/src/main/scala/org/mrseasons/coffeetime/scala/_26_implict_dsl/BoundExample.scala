package org.mrseasons.coffeetime.scala._26_implict_dsl

;

/**
 * Created by mrseasons on 2015/06/16.
 */
object BoundExample extends App {

  //  testViewBound
  testContextBound()

  def testViewBound(): Unit = {
    val t = new T
    f1(t) //  B

    implicit def t2ToB(t: T2): B = new B
    val t2 = new T2
    f1(t2) //  B
  }

  def testContextBound(): Unit = {
    val c2 = new C2
//    f3(c2)
  }

  //  View Bounds
  //  def f1[T](implicit f2: T => A[T]) -> def f1[T <% A[T]]
  //  enable the use of some type A as if it were some type B
  //  In other words, A should have an implicit conversion to B available
  def f1[A <% B](a: B) = a.invokeB()

  def f2[A](a: B)(implicit ev1: A => B) = a.invokeB()

  //  Context Bounds, type class pattern
  //  def f[T]( implicit a:A[T] )  -> def f[T:A]
  //  def f3[A: C](a: C) = a.invokeC
  /*
    Generally, a type parameter with a context bound is of the form [T: Bound];
    it is expanded to plain type parameter T together with an implicit parameter of type Bound[T]
   */
  def f3[A: List](a: A) = {}

  def f4[A](a: A)(implicit ev: List[A]) = {}


  //  http://stackoverflow.com/questions/2982276/what-is-a-context-bound-in-scala
}

class B {
  def invokeB() = println("B")
}

class T extends B {
}

class T2 {}

class C[A] {
  def invokeC() = println("C")
}

class C2 extends C {
}