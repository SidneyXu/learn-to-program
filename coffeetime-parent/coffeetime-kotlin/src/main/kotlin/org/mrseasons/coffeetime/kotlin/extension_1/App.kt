package org.mrseasons.coffeetime.kotlin.extension_1

/**
 * Created by mrseasons on 2015/06/08.
 */
fun main(args: Array<String>) {
    //  Extension Function
    var n: Num = Num(10)
    n.add(4)
    n.add(1, 3)
    println(n.x)    //  18

    n.foo()         //  foo in Num

    //  Nullable Receiver
    var n2: Num? = null
    println(n2.toString())  //  a null num

    //  Extension Properties
    val l:List<Int> = listOf(1,2,3)
    println(l.abc)  //  abc

    //  Companion Object Extensions
    MyClass.foo()   //  foo in companion object



}
