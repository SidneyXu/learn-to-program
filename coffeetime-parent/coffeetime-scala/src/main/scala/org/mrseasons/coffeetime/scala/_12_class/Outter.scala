package org.mrseasons.coffeetime.scala._12_class

import scala.collection.mutable.ArrayBuffer

/**
 * Created by mrseasons on 2/13/15.
 */
class Outter {

  class Inner(val name: String) {
    def desc = Outter.this.name + "-" + name

    val contacts = new ArrayBuffer[Inner]
  }

  val name = "outter"

  private val members = new ArrayBuffer[Inner]

  def join(name: String) = {
    val inner = new Inner(name)
    members += inner
    inner
  }

}

class Outter2 {
  outer =>

  class Inner2(val name: String) {
    def desc = outer.name + "-" + name
  }

  val name = "outter"
}

