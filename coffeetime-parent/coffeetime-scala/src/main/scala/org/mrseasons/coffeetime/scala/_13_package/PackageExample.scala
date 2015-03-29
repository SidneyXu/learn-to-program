package org.mrseasons.coffeetime.scala._13_package

import org.mrseasons.coffeetime.scala._13_package.A.B.C.{D2, D}
import java.awt.{Color,Font}
import java.util.{HashMap=>JavaHashMap}
import java.util._

package A {
  package B {

    class B {
      def print = println("B")
    }
    package C {

      class D {
        //directly access
        val b = new B
        val d2 = new D2
        b.print

        def print = println("D")
        d2.desc
      }

    }

  }

}

package A.B.C {

  import org.mrseasons.coffeetime.scala._13_package.A.B.B

  class D2 {
    //need import package
    val b = new B

    def print = println("D2")
    b.print

    private[C] def desc = "desc"

    private[B] def impress = "impress"
  }

}

package object people {
  val defaultName = "Default Name"
}

/**
 * Created by mrseasons on 2/15/15.
 */
object PackageExample {

  def main(args: Array[String]) {
    def d = new D()
    d.print

    def d2 = new D2
    d2.print

    println(people.defaultName)
  }
}
