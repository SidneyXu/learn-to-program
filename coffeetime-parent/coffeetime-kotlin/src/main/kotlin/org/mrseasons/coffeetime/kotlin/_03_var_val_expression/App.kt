package org.mrseasons.coffeetime.kotlin._03_var_val_expression

/**
 * Created by mrseasons on 2015/06/03.
 */
fun main(args: Array<String>) {
    //  Immutable
    val a: Int = 1
    val b = 2
    val c: Int
    c = 3

    // Mutable
    var x = 5
    x += 1
    println(x)  //  6

    //Face Expression
    val z = if (a > b) a else b
    println(z)  //  2
}