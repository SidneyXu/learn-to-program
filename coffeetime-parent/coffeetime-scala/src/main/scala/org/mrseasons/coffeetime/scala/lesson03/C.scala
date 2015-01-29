package org.mrseasons.coffeetime.scala.lesson03

/**
 * Created by mrseasons on 1/29/15.
 */
class C {

  var acc = 0

  def methodInc = {
    acc += 1
  }

  def functionInc = { () => acc += 1 }

}
