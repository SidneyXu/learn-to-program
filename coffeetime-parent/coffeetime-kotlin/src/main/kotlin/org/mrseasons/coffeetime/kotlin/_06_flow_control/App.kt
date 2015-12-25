package org.mrseasons.coffeetime.kotlin._06_flow_control

/**
 * Created by mrseasons on 2015/06/03.
 */
fun main(args: Array<String>) {
    //  support break and continue

    testIf()

    testFor()

    testWhile()

    testRange()

}

private fun testIf() {
    //  if
    //  Traditional usage
    var max = 1
    if (1 < 2)
        max = 2

    //  last expression as value of a block
    max = if (1 < 2) {
        println("a")
        2
    } else {
        println("b")
        1
    }

    //  As expression
    val x = -1
    val s = if (x > 0) 1 else -1
    val s2 = if (x > 0) "a" else 65
    val s3: Any = if (x > 0) 1 else Unit

    println(s)  //  -1
    println(s2) //  65
    println(s3) //  kotlin.Unit

    println(s.javaClass)    //  int
    println(s2.javaClass)   //  java.lang.Integer
    println(s3.javaClass)   //  kotlin.Unit
}

private fun testFor() {
    val arr = intArrayOf(1, 2, 3)
    for ( a in arr) {
        println(a)
    }

    for (i in arr.indices) {
        println(arr[i])
    }

    for (s in "Hello")
        print(s)
    println()
}

private fun testWhile() {
    val arr = intArrayOf(1, 2, 3)
    var i = 0
    while ( i < arr.size) {
        println(arr[i++])
    }

    do {
        i++
    } while (i < 5)
}


private fun testRange() {
    //  Check if a number is within a range
    val x = 3
    val y = 10
    if (x in 1..y - 1)
        println("OK")   //  OK
    else
        println("OUT")

    //  Check if a number is out of range
    val arr = intArrayOf(1, 2, 3, 4, 5)
    if ( x !in 0..arr.lastIndex)
        println("OUT")

    //  String
    val str = "abcdef"
    if (str in "abc".."abe") {
        println(str)    //  abcdef
    }

    //  Iterating over a range
    for (z in 1..5)
        print(z)    //  12345
    println()

    for (z in 4 downTo 1)
        print(z)    //  4321
    println()

    for (z in 1..4 step 2)
        print(z)    //  13
    println()

    for (z in 4 downTo 1 step 2)
        print(z)    //  42
    println()

    for (z in (1..4).reversed())
        print(z)    //  4321
    println()
}

