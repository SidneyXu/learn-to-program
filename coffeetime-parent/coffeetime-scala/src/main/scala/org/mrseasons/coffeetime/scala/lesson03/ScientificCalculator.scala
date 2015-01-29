package org.mrseasons.coffeetime.scala.lesson03

/**
 * Created by mrseasons on 1/29/15.
 */
class ScientificCalculator(brand: String) extends Calculator2(brand: String) {
  def log(m: Double, base: Double) = math.log(m) / math.log(base)

  //override
  def add(m: Int):Unit = add(m, 1)
}
