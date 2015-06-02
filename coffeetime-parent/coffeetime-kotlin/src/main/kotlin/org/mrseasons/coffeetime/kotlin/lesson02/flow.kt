//package org.mrseasons.coffeetime.kotlin.lesson02
//
///**
// * Created by mrseasons on 1/29/15.
// */
//
////---If---
//fun ifFlow() {
//    // Traditional usage
//    val a = 1
//    val b = 2
//    var max: Int
//    if (a > b)
//        max = a
//    else
//        max = b
//
//    // As expression
//    max = if (a > b) a else b
//
//    println(max)   //2
//
//    // With block
//    val bmax = if (a > b) {
//        print("Choose a:")
//        a
//    } else {
//        print("Choose b:")
//        b
//    }
//    println(bmax)   //Choose b:2
//}
//
////---When---
//fun whenFlow(x: Int) {
//    var a = 4
//    when (x) {
//        1 -> print("x == 1")
//        2 -> print("x == 2")
//        3, 4 -> print("x == 3 or x == 4")
//        a + 1 -> print("x == 5")
//        in 6..10 -> print("x is in the range")
//        !in 10..20 -> print("x is outside the range")
////        in 1..100 -> {
////            if (x < 50) {
////                continue
////            } else {
////                print("x is between 1 and 50")
////            }
////        }
//        51, 100 -> print("x is between 51 and 100")
//        else -> {
//            // Note the block
//            print("x is neither 1 nor 2")
//        }
//    }
//    val term="term"
//    when (term){
//        is kotlin.String -> if (term=="term") continue else print(term)
//        else -> print("Nope!")
//    }
//}
//
//
//
//fun main(args: Array<String>) {
//    whenFlow(4)
//}