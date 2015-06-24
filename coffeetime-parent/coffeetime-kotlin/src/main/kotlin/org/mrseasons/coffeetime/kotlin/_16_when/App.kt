package org.mrseasons.coffeetime.kotlin._16_when


/**
 * Created by mrseasons on 2015/06/24.
 */
fun main(args: Array<String>) {

    //when
    //  no need break

    // like switch
    val x = 10
    when (x) {
        1 -> println("x==1")
        2 -> println("x==2")
        3, 10 -> println("x==3 or x==10")
        in 10..20 -> println("x is between 10 and 20")
        !in 20..30 -> println("x is not between 20 and 30")
        is Int -> println("long")
        add(x) -> println("x=" + x)
        else -> println("else")
    }

    val y = when (x) {
        1 -> 2
        3 -> 4
        else -> 0
    }
    println(y)  //  0

    //  like if else
    when {
        x == 5 -> println("x==5")
        else -> println("x!=5")
    }
}

private fun add(x: Int): Int {
    return x + 1
}