package org.mrseasons.coffeetime.kotlin._09_collection

/**
 * Created by mrseasons on 2015/06/26.
 */
fun main(args: Array<String>) {

    //  empty list
    val empty = emptyList<Int>()

    //  immutable list
    val list = listOf("a", "b", "c")
    println(list)   //  [a, b, c]

    //  mutable list
    val mList = linkedListOf("a", "b", "c")
    mList.add("d")
    println(mList)  //  [a, b, c, d]

    //  traversing a list
    val names = listOf("Mike", "Peter", "Jane", "Mary")
    names.filter {
        it.startsWith("M")
    }.sortedBy {
        it
    }.map {
        it.toUpperCase()
    }.forEach { print("${it},") }
    println()   //  MARY,MIKE,

}