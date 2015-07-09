package org.mrseasons.coffeetime.kotlin._12_object_enum

/**
 * Created by mrseasons on 2015/06/10.
 */
////  Object expression is used to make a slight modification of some class.
open class A(x: Int) {
    public open val y: Int = x
}

interface B {
    fun info()
}

//  Object declaration
//  singleton
object Singleton {
    private var num = 0

    fun sequence(): Int {
        num += 1
        return num
    }
}

//  Companion Object
//  An object declaration inside a class can be marked with the companion keyword
class Companion(private var balance: Int = 0) {
    companion object Factory {
        private var num = 0

        fun create(): Companion = Companion()

        private fun sequence(): Int {
            num += 1
            return num
        }


        fun getInfo(comp: Companion): String {
            return "balance is " + comp.balance
        }
    }

    val id = Companion.sequence()
}

//  Differences between Object expression and Object declaration
//  object declarations are initialized lazily, when accessed for the first time
//  object expressions are executed (and initialized) immediately, where they are used