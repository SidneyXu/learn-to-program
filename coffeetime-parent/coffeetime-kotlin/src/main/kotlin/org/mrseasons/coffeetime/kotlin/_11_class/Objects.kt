package org.mrseasons.coffeetime.kotlin._11_class

/**
 * Created by mrseasons on 2015/06/10.
 */
//  Object expression is used to make a slight modification of some class.
open class A(x: Int) {
    public open val y: Int = x
}

interface B {}

//  Object declaration
//  singleton
object Manager {
    fun register() {

    }
}

//  Companion Object
//  An object declaration inside a class can be marked with the companion keyword
class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}

//  Differences between Object expression and Object declaration
//  object declarations are initialized lazily, when accessed for the first time
//  object expressions are executed (and initialized) immediately, where they are used