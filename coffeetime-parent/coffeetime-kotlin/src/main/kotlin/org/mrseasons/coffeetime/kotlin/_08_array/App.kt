package org.mrseasons.coffeetime.kotlin._08_array

/**
 * Created by mrseasons on 2015/06/04.
 */
fun main(args: Array<String>) {
    //  create an array
    //  Empty array with specified size
    //  must specify type
    val fixedSizeArray = arrayOfNulls<Int>(5)

    //  boxing array
    val arr = arrayOf(1, 2, 3)

    //  primitive type array
    val intArr = intArrayOf(1, 2, 3)

    //  Empty array
    val empty = emptyArray<Int>()

    //  Use factory function
    val asc = Array(3, { i -> i * i })
    println(asc.toList())   //  [0, 1, 4]

    //  access elements
    println(asc[1])         //  1
    println(asc.get(1))     //  1
    //    println(asc[10])      ArrayIndexOutOfBoundsException

    //  modify
    asc[1] = 10
    println(asc.toList())   //  [0, 10, 4]

    //  loop array
    for ( i in asc) {
        println(i)
    }

    for (i in asc.indices) {
        println(asc[i])
    }

    // check index
    val i = 10
    if (i in asc.indices) {     // i>=0 && i<asc.size()
        println("indices:" + i)
    }
}