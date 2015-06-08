package org.mrseasons.coffeetime.kotlin.extension

/**
 * Created by mrseasons on 2015/06/08.
 */
//  Extension Function
//  Extensions are resolved statically, do not actually modify class
//  this corresponds to the receiver object
fun Num.add(x: Int, y: Int) {
    this.x += x + y
}

fun Num.foo() {
    println("foo in extension")
}

class Num(var x: Int) {
    fun add(y: Int) {
        x += y
    }

    // a member always win an extension
    fun foo() {
        println("foo in Num")
    }
}
