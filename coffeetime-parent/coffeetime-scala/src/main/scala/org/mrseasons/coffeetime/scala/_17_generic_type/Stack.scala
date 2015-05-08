package org.mrseasons.coffeetime.scala._17_generic_type

/**
 * Created by mrseasons on 2015/05/08.
 */
//define generic type
abstract class Stack[A] {
  def push(x: A): Stack[A] = new NonEmptyStack[A](x, this)

  def isEmpty: Boolean

  def top: A

  def pop: Stack[A]
}

class EmptyStack[A] extends Stack[A] {
  override def top: A = sys.error("EmptyStack.top")

  override def isEmpty: Boolean = true

  override def pop: Stack[A] = sys.error("EmptyStack.pop")
}

class NonEmptyStack[A](elem: A, rest: Stack[A]) extends Stack[A] {
  override def top: A = elem

  override def isEmpty: Boolean = false

  override def pop: Stack[A] = rest
}
