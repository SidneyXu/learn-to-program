package org.mrseasons.coffeetime.kotlin.data_2

/**
 * Created by mrseasons on 2015/06/09.
 */
fun main(args: Array<String>) {
    //  Data classes
    val jack = User("Jack", 21)

    //  Copying
    val jack2 = jack.copy()
    val jack3 = jack.copy(name = "")

    println(jack2)  //  User(name=Jack, age=21)
    println(jack3)  //  User(name=, age=21)

    //  Component Function
    val (name, age) = jack
    println(name + "=" + age)   //  Jack=21

}
