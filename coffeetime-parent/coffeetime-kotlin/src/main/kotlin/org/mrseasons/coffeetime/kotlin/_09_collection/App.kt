package org.mrseasons.coffeetime.kotlin._09_collection

/**
 * Created by mrseasons on 2015/06/26.
 */
fun main(args: Array<String>) {
    val names = listOf("Mike", "Peter", "Jane", "Mary")
    names filter {
        it.startsWith("M")
    } sortBy {
        it
    }map {
        it.toUpperCase()
    }forEach { print("${it},") }


}