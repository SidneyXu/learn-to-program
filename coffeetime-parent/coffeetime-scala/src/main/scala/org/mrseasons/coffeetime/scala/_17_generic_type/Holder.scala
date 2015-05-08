package org.mrseasons.coffeetime.scala._17_generic_type

/**
 * Created by mrseasons on 2015/05/08.
 */
class Holder[A](a: A) {
  def info = println(a)

  def apply(ele: A) = print()
}

class CovariantHolder[+A](a: A) {
  def info = println(a)

  //wrong, contravariant in covariant is not allowed
  //   def apply(ele:A) = _
}

class ContravarintHolder[-A](a: A) {
  def info = println(a)

  def apply(ele: A) = print()
}

class LeastHolder[A >: Nothing](a: A) {
}