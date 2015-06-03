package org.mrseasons.coffeetime.kotlin._06_flow_control

/**
 * Created by mrseasons on 2015/06/03.
 */
fun main(args: Array<String>) {
    testIf()


}

private fun testIf() {
    //  if
    val x = -1
    val s = if (x > 0) 1 else -1
    val s2 = if (x > 0) "a" else 65
    val s3 = if (x > 0) 1 else Unit

    println(s)  //  -1
    println(s2) //  65
    println(s3) //  kotlin.Unit

    println(s.javaClass)    //  int
    println(s2.javaClass)   //  java.lang.Integer
    println(s3.javaClass)   //  kotlin.Unit
}

//private fun testFor(){
//    for(i in
//    println(i)
//}


//fun main(args: Array<String>) {
////    for (arg in args)
////        print(arg)
//
//
//}
//or
//for (i in args.indices)
//print(args[i])
