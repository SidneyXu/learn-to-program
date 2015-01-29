package org.mrseasons.coffeetime.scala.lesson04

/**
 * Created by mrseasons on 1/29/15.
 */
class FooBar(foo: String)

object FooBar {
  def apply(foo: String) = new FooBar(foo)
}