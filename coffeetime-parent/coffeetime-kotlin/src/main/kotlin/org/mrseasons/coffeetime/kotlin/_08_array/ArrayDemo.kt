package org.mrseasons.coffeetime.kotlin._08_array

/**
 * Created by mrseasons on 2015/06/04.
 */
fun main(args: Array<String>) {
    //  create an array
    //  boxing array
    val arr = arrayOf(1, 2, 3)

    //  primitive type array
    val intArr = intArrayOf(1, 2, 3)

    //  Empty array with specified size
    //  must specify type
    val emptyArr = arrayOfNulls<Int>(5)

    //  Use factory function
    val asc = Array(3, { i -> i * i })
    println(asc.toList())   //  [0, 1, 4]

    //  access elements
    println(asc[1])         //  1
    println(asc.get(1))     //  1

    //  modify
    asc[1] = 10
    println(asc.toList())   //  [0, 10, 4]

}