package org.mrseasons.coffeetime.kotlin._02_type

/**
 * Created by mrseasons on 2015/06/04.
 */
fun main(args: Array<String>) {
    //Number
    //  Number is close to Java, but Char is not Number
    //  Wrong!!
    //  val c:Char = 1

    //  type conversion
    //  Correct, literals are checked statically
    val b: Byte = 1

    //  Wrong!! implicit conversion not supported
    //  val i:Int=b

    //  Explicit conversion
    val i: Int = b.toInt()

    //  Operations
    //    shl(bits) – signed shift left (Java’s << )
    //    shr(bits) – signed shift right (Java’s >> )
    //    ushr(bits) – unsigned shift right (Java’s >>> )
    //    and(bits) – bitwise and
    //    or(bits) – bitwise or
    //    xor(bits) – bitwise xor
    //    inv() – bitwise inversion
    val x = 1 shl 2
    println(x)  //  4


    //Char
    val c: Char = 'a'

    //Boolean
    val flag: Boolean = true && false

    //String
    //  literals
    val s = "Hello World"
    for (x in s) {
        print(x)    //  Hello World
    }
    println()

    val text = """
1, 2, 3
    one, two, three
        "x", "y", "z"
    """
    println(text)

    //  templates
    val name = "Peter"
    val str = "name=$name, $name.length, ${name.length()}"
    println(str)    //  name=Peter, Peter.length, 5
}