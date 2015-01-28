package org.mrseasons.coffeetime.kotlin

/**
 * Created by mrseasons on 15-1-28.
 */
fun main(args: Array<String>) {
    println("Hello World")
}


//Defining functions
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

public fun sum3(a: Int, b: Int): Int = a + b

fun printSum(a: Int, b: Int): Unit {
    print(a + b)
}

public fun printSum2(a: Int, b: Int) {
    print(a + b)
}

//Defining local variables
//read only
//val a: Int = 1
//val b = 1 // `Int` type is inferred
//val c: Int // Type required when no initializer is provided
//c = 1 // definite assignment
//
//var x = 5 // `Int` type is inferred
//x += 1

