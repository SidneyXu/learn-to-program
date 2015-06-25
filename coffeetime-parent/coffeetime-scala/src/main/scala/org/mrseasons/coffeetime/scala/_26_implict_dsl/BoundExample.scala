package org.mrseasons.coffeetime.scala._26_implict_dsl

;

/**
 * Created by mrseasons on 2015/06/16.
 */
object BoundExample extends App {

  testViewBound()
  testContextBound()

  //  View Bounds
  //  def f1[T](implicit f2: T => A[T]) -> def f1[T <% A[T]]
  //  enable the use of some type A as if it were some type B
  //  In other words, A should have an implicit conversion to B available
  def f1[A <% B](a: B) = {}

  def f2[A](a: B)(implicit ev1: A => B) = {}

  def testViewBound(): Unit = {
    implicit def b2ToB(t: B2): B = new B

    val b = new B2
    f1(b)
  }

  //  Context Bounds, type class pattern
  /*
    Generally, a type parameter with a context bound is of the form [T: Bound];
    it is expanded to plain type parameter T together with an implicit parameter of type Bound[T]
   */
  def f3[A: List](a: A) = {}

  def f4[A](a: A)(implicit ev: List[A]) = {}

  def testContextBound(): Unit = {
    implicit val list = List[C]()
    val c = new C
    f3(c)
  }


  class B {}

  class B2 {}

  class C {}

}

