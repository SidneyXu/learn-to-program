package org.mrseasons.coffeetime.kotlin._21_io

import java.io.Console
import java.io.File

/**
 * Created by mrseasons on 2015/07/13.
 */
fun main(args: Array<String>) {

    var source = File("coffeetime-kotlin/myfile.txt")
    val lines = source.readLines("UTF-8")
    for (l in lines) {
        println(l)
    }

    val contents = source.readText("UTF-8")
    println(contents)

}