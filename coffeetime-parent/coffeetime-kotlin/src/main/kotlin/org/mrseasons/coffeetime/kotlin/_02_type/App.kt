package org.mrseasons.coffeetime.kotlin._02_type

import java.util.Date

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


    // Type Checks and Casts
    //  is and !is Operators
    if (name is String) {
        //  Smart Casts
        //  compiler is smart enough to make name automatically cast to String
        println(name.length())
    }
    if (name !is String) {
        println("not a string")
    }

    // Unsafe Cast Operator
    //  If thing is null or the cast is not possible, the exception will be thrown
    val thing: Any = "any"
    val empty: Any? = null

    var m: String = thing as String
    //    m: String = empty as String   kotlin.Any? cannot be cast to kotlin.String
    println(m)  //  any

    var n: String? = thing as String?
    n :String = empty as String?
    println(n)  //  null

    //  as? return the result of the cast or null on failure
    var p: String? = thing as? String
    p: String? = empty as? String
    println(p)  //  null


    //  Equality
    //    In Kotlin there are two types of equality:
    //    Referential equality (two references point to the same object)
    //    Structural equality (a check for equals() )

    //  Referential equality
    //  Referential equality is checked by the === operation (and its negated counterpart !== )
    // or identityEquals() function.
    // a === b evaluates to true if and only if a and b point to the same object.
    val now = Date()
    val refNow1 = now
    val refNow2 = now
    val newRef = Date()
    println(refNow1 identityEquals refNow2) //  true
    println(refNow1 === refNow2)    //  true
    println(refNow1 !== refNow2)    //  false
    println(refNow1 !== newRef) //  true

    //   Structural equality
    //    Structural equality is checked by the == operation (and its negated counterpart != ).
    println(refNow1 == refNow2) //  true, is translated to a?.equals(b) ?: b === null
    println(refNow1 != refNow2) //  false
    println(refNow1 != newRef)  //  false
}