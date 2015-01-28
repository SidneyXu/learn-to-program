package org.mrseasons.coffeetime.kotlin.lesson01

/**
 * Created by mrseasons on 1/28/15.
 */
//Number
//Literal Constants
//Long 类型结尾为 L
//不支持8进制
fun num() {
    val i: Int = 123
    val l: Long = 123L
    val h: Int = 0x0F
    var b: Int = 0b00000101
}

//boxing
fun boxing() {
    val a: Int = 10000
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(a identityEquals a) // Prints 'true'
    println(boxedA identityEquals anotherBoxedA) // !!!Prints 'false'!!!

    println(a == a) // Prints 'true'
    println(boxedA == anotherBoxedA) // Prints 'true'
}

//explicit conversions
fun explicit() {
    val a: Int = 1
    val b: Long = a.toLong()
    //    println(a==b)

    val l: Long = 2 + 3
}

//operation
fun oper() {
    val a: Int = 1 + 2

    val b = 1 shl  2
    println(b)
}

//arrays
fun arr() {
    var asc = Array(5, { i -> i * i })  //0,1,4,9,16
    println(asc)

    asc = array(30, 20, 10) //30,20,10
    println(asc)

    //    asc[4]=5  out of bounds

    for (i in asc) {
        println(i)  //30,20,10
    }
    for (i in asc.indices) {
        println(i)  //0,1,2
    }
    var i = 2
    if (i in asc) {
        println("i:" + i)   //no output
    }
    if (i in asc.indices) {
        println("indices:" + i) //2
    }
    if (i >= 0 && i < asc.size()) {
        println("indices:" + i)  //2
    }
    for (j in asc.indices) {
        println(j)  //0,1,2
    }
}

fun main(args: Array<String>) {
    arr()
}
