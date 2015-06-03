package org.mrseasons.coffeetime.kotlin._05_function

/**
 * Created by mrseasons on 2015/06/03.
 */
fun main(args: Array<String>) {

    //call functions
    println(five())

}

//define functions
fun addOne(m: Int): Int = m + 1

fun addTwo(m: Int): Int {
    return m + 2
}

fun five(): Int {
    val x = 2 + 3
    val y = 3 + 2
    return x + y
}

fun echo(s: String): Unit {
    println(s)
}

fun echo2(s: String) {
    println(s)
}

public fun sum(a: Int, b: Int): Int = a + b