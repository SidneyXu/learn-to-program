package org.mrseasons.coffeetime.kotlin._05_function

/**
 * Created by mrseasons on 2015/06/24.
 */
//  functions can be declared at top level in a file, meaning you do not need to create a class to hold a function
//  Local Functions
//  a function inside another function
fun factorialTail(n: Int): Int {
    //  Local function can access local variables of outer functions
    val zero = 0

    fun loop(acc: Int, n: Int): Int =
            if (n == zero) acc else loop(n * acc, n - 1)

    return loop(1, n)
}

//  Member Functions
//  A member function is a function that is defined inside a class or object
class Sample {
    fun foo() {
        println("bar")
    }
}

//  Infix notation
//Functions can also be called using infix notations when
//They are member functions or extension functions
//They have a single parameter
// Define extension to Int
fun Int.shl(x: Int): Int {
    return x * 10
}
//// call extension function using infix notation
//1 shl 2
//// is the same as
//1.shl(2)