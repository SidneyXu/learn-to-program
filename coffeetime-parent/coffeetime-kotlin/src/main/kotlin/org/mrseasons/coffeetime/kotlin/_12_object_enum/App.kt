package org.mrseasons.coffeetime.kotlin._12_object_enum

/**
 * Created by mrseasons on 2015/06/25.
 */
fun main(args: Array<String>) {
    testObjects()
    testEnum()
}

fun testObjects() {
    //  Object Declaration
    //  Singleton
    Singleton.sequence()
    Singleton.sequence()
    println(Singleton.sequence())

    //  Companion Object
    val c = Companion.create()

    //   like Java’s anonymous inner classes,
    val ab = object : A(1), B {
        override fun info() {
            println("info")
        }

        override val y: Int
            get() = 15
    }

    println(ab.y)
    println(ab.javaClass)

    //  Object Expression
    //   “just an object”, with no nontrivial supertypes
    val adHoc = object {
        var x: Int = 1
        var y: Int = 2
    }

    println(adHoc.x)
}

fun testEnum() {
    println(TrafficColor.GREEN)     //  GREEN
    println(TrafficColor.GREEN.name())  //  GREEN
    println(TrafficColor.GREEN.ordinal())   //  2
}