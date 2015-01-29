package org.mrseasons.coffeetime.kotlin.lesson02

/**
 * Created by mrseasons on 1/29/15.
 */

//---If---
fun ifFlow() {
    // Traditional usage
    val a = 1
    val b = 2
    var max: Int
    if (a > b)
        max = a
    else
        max = b

    // As expression
    max = if (a > b) a else b

    println(max)   //2

    // With block
    val bmax = if (a > b) {
        print("Choose a:")
        a
    } else {
        print("Choose b:")
        b
    }
    println(bmax)   //Choose b:2
}


fun main(args: Array<String>) {
    ifFlow()
}