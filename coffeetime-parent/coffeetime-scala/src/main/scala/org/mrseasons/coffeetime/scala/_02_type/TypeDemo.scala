package org.mrseasons.coffeetime.scala._02_type

/**
  * Created by mrseasons on 2015/06/04.
  */
object TypeDemo {

    def main(args: Array[String]) {
        //everything is object
        println(1.toString) //1

        //type conversion
        //  Implicit conversion
        val b: Byte = 1
        val i: Int = b
        val c: Char = 1

        //  Explicit conversion
        println(99.98.toInt) //99
        println(99.toChar) //c
        println("99.12".toDouble) //99.12

        //BigInt and BigDecimal
        var x: BigInt = 4
        println(4 * 4 * 4)


        //String
        //  literals
        val s = "Hello World"
        for (x <- s) {
            print(x)
        }
        println()

        val text =
            """
1, 2, 3
    one, two, three
        "x", "y", "z"
            """
        println(text)

        //  templates
        val name = "Peter"

        //  The s String Interpolator
        val str = s"name=$name, $name.length, ${name.length()}"
        println(str) //  name=Peter, Peter.length, 5

        //  The f String Interpolator
        val salary = 100.1
        println(f"$name%s has $salary%2.3f") //  Peter has 100.100
    }
}
