package org.mrseasons.coffeetime.scala._17_generic_type

/**
 * Created by mrseasons on 3/12/15.
 */
//upper bounds
abstract class Bag[A <: Ordered[A]] {
  def incl(x: A): Bag[A]

  def contains(x: A): Boolean
}

class EmptyBag[A <: Ordered[A]] extends Bag[A] {

  override def incl(x: A): Bag[A] = new NotEmptyBag(x, new EmptyBag[A], new EmptyBag[A])

  override def contains(x: A): Boolean = false
}

class NotEmptyBag[A <: Ordered[A]](elem: A, left: Bag[A], right: Bag[A]) extends Bag[A] {
  override def incl(x: A): Bag[A] =
    if (x < elem) new NotEmptyBag(elem, left incl x, right)
    else if (x > elem) new NotEmptyBag(elem, left, right incl x)
    else this

  override def contains(x: A): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true
}
