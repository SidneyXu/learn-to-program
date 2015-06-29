package org.mrseasons.coffeetime.kotlin._05_function

/**
 * Created by mrseasons on 2015/06/24.
 */
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
