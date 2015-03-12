package org.mrseasons.coffeetime.scala._17_generic_type

/**
 * Created by mrseasons on 3/12/15.
 */
trait Ordered[A] {

  def compare(that: A): Int

  def <(that: A): Boolean = (this compare that) < 0

  def >(that: A): Boolean = (this compare that) > 0

  def <=(that: A): Boolean = (this compare that) <= 0

  def >=(that: A): Boolean = (this compare that) >= 0

  def compareTo(that: A): Int = compare(that)
}

case class Num(value: Double) extends Ordered[Num] {
  override def compare(that: Num): Int =
    if (this.value < that.value) -1
    else if (this.value > that.value) 1
    else 0

}