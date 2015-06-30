package org.mrseasons.coffeetime.kotlin._07_exception

import java.io.IOException

/**
 * Created by mrseasons on 2015/06/26.
 */
fun main(args: Array<String>) {
    //  Kotlin does not have checked exceptions.

    try {
        throw IOException()
    } catch(e: IOException) {
        println("io exception")
    } catch(e: Exception) {
        e.printStackTrace()
    } finally {

    }

    //  try is an expression, so it may have a return value
    val a: Int = try {
        val x: Int = 1 / 0
        x
    } catch(e: Exception) {
        -1
    }


}