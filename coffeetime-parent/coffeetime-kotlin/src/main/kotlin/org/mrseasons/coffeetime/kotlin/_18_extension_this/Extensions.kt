package org.mrseasons.coffeetime.kotlin._18_extension_this

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

//  Nullable Receiver
fun Num?.toString(): String {
    if (this == null) return "a null num"
    return toString()
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

//  Extension Properties
//  Their behavior can only be defined by explicitly providing getters/setters
val <T> List<T>.abc: String
    get() = "abc"

//  Companion Object Extensions
class MyClass {
    companion object {}
}

fun MyClass.Companion.foo() {
    println("foo in companion object")
}
