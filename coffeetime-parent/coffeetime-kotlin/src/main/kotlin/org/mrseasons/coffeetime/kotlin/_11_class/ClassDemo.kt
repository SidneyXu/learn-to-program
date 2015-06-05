package org.mrseasons.coffeetime.kotlin._11_class

/**
 * Created by mrseasons on 2015/06/05.
 */
fun main(args: Array<String>) {

}

fun testMan() {
    //no keyword: new
    val m1 = Man("Fred", 21)   //  primary
    val m2 = Man("Fred")  //  secondary
    val m3 = Man(21)      //  secondary

    //    val w1 = Woman("Jane",21)    primary is private
    val w2 = Woman("Jane")
}