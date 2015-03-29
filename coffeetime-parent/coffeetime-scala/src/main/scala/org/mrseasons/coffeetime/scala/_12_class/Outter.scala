package org.mrseasons.coffeetime.scala._12_class

import scala.collection.mutable.ArrayBuffer

/**
 * Created by mrseasons on 2/13/15.
 */
class Outter {

  val name = "outter"
  private val members = new ArrayBuffer[Inner]

  def join(name: String) = {
    val inner = new Inner(name)
    members += inner
    inner
  }

  class Inner(val name: String) {
    val contacts = new ArrayBuffer[Inner]

    def desc = Outter.this.name + "-" + name
  }

}

class Outter2 {
  outer =>

  val name = "outter"

  class Inner2(val name: String) {
    def desc = outer.name + "-" + name
  }
}

