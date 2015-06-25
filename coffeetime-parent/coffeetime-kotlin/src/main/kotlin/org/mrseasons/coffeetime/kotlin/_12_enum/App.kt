package org.mrseasons.coffeetime.kotlin._12_enum

/**
 * Created by mrseasons on 2015/06/25.
 */
fun main(args: Array<String>) {
    testEnum()
}

fun testEnum() {
    println(TrafficColor.GREEN)     //  GREEN
    println(TrafficColor.GREEN.name())  //  GREEN
    println(TrafficColor.GREEN.ordinal())   //  2
}