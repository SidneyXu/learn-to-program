package org.mrseasons.coffeetime.scala

/**
 * Created by mrseasons on 4/13/15.
 */
import org.specs2.mutable._

class FactorialSpec extends Specification {
  args.report(color = false)

  def factorial(n: Int) = (1 to n).product

  "The 'Hello world' string" should {
    "factorial 3 must be 6" in {
      factorial(3) mustEqual 6
    }
    "factorial 4 must greaterThan 6" in {
      factorial(4) must greaterThan(6)
    }
  }

  specs2.run (new FactorialSpec)
}