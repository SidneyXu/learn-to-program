package org.mrseasons.coffeetime.kotlin.delegation_4

/**
 * Created by mrseasons on 2015/06/10.
 */
fun main(args: Array<String>) {
    //  Class Delegation
    val b = BaseImpl(19)
    b.println() //  19

    /*
     *  The by-clause in the supertype list for Derived indicates that b will be stored internally in objects of Derived and the
     *   compiler will generate all the methods of Base that forward to b .
     */
    Derived(b).println()    //  19

    //  Delegated Properties
    val e = Example()
    println(e.p)

    e.p = "NEW"
    println(e.p)
}
