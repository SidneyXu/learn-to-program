package org.mrseasons.coffeetime.kotlin.extension

/**
 * Created by mrseasons on 2015/06/08.
 */
fun main(args: Array<String>) {
    var n: Num = Num(10)
    n.add(4)
    n.add(1, 3)
    println(n.x)    //  18

    n.foo()         //  foo in Num
}
