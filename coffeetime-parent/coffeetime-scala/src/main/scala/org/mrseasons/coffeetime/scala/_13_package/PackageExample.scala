package org.mrseasons.coffeetime.scala._13_package

//import
import org.mrseasons.coffeetime.scala._13_package.A.B.C.{D2, D}
import java.awt.{Color,Font}
//  rename
import java.util.{HashMap=>JavaHashMap}

// create a package
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

//package chain
package A.B.C {

  //import
  import org.mrseasons.coffeetime.scala._13_package.A.B.B

  class D2 {
    //need import package
    val b = new B

    def print = println("D2")
    b.print

    //package visibility
    private[C] def desc = "desc"

    private[B] def impress = "impress"
  }

}

//package object
package object people {
  val defaultName = "Default Name"
}

/**
 * Created by mrseasons on 2015/2/15.
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
