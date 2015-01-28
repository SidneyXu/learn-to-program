package org.mrseasons.coffeetime.kotlin.lesson01

/**
 * Created by mrseasons on 1/28/15.
 */
//everything is an object

//Number
//Literal Constants
//Long 类型结尾为 L
//不支持8进制
fun num(){
    val i: Int = 123
    val l: Long = 123L
    val h: Int = 0x0F
    var b: Int = 0b00000101
}

//boxing
fun boxing(){
    val a: Int = 10000
    //print(a identityEquals a) // Prints 'true'
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    print(boxedA identityEquals anotherBoxedA) // !!!Prints 'false'!!!

    //print(a == a) // Prints 'true'
    val boxedB: Int? = a
    val anotherBoxedB: Int? = a
    print(boxedB == anotherBoxedB) // Prints 'true'

}




