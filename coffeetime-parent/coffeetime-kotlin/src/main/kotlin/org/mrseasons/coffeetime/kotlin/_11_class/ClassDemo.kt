package org.mrseasons.coffeetime.kotlin._11_class

/**
 * Created by mrseasons on 2015/06/05.
 */
fun main(args: Array<String>) {
    testPerson()
    testEnum()
}

fun testMan() {
    //no keyword: new
    val m1 = Man("Fred", 21)   //  primary
    val m2 = Man("Fred")  //  secondary
    val m3 = Man(21)      //  secondary

    //    val w1 = Woman("Jane",21)    primary is private
    val w2 = Woman("Jane")
}

fun testPerson() {
    val p1 = Person()
    p1.age = 10
    println(p1.age) //  10

    p1.trueAge = 20
    p1.trueAge = 14
    println(p1.trueAge)  //  20

    p1.backAge = 30
    p1.backAge = 15
    println(p1.backAge) //  30
}

fun testEnum() {
    println(TrafficColor.GREEN)     //  GREEN
    println(TrafficColor.GREEN.name())  //  GREEN
    println(TrafficColor.GREEN.ordinal())   //  2
}