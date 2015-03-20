package org.mrseasons.coffeetime.scala._17_generic_type

/**
 * Created by mrseasons on 3/20/15.
 */
class Holder[A](a: A) {
  def info = println(a)

  def apply(ele: A) = print()
}

class CoHolder[+A](a: A) {
  def info = println(a)

  //wrong, contravariant
  //   def apply(ele:A) = _
}

class DcoHolder[-A](a: A) {
  def info = println(a)

  def apply(ele: A) = print()
}

class LeastHolder[A >: Nothing](a: A) {
}