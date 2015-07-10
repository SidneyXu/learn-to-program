package org.mrseasons.coffeetime.kotlin._11_class

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.JComponent

/**
 * Created by mrseasons on 2015/06/05.
 */
fun main(args: Array<String>) {
    //  Visiblity
    //    private — visible only in the declaring scope and its subscopes (inside the same module);
    //    protected — (applicable only to class/interface members) like private , but also visible in subclasses;
    //    internal — (used by default) visible everywhere within the same module (if the owner of declaring scope is visible);
    //    public — visible everywhere (if the owner of declaring scope is visible).

    testCounter()
    testPerson()
    testMan()
    testCustomer()
}

fun testCounter() {
    val counter = Counter()
    counter.increment()
    println(counter.current())
    //    println(counter.value)    can not access
    println(counter.publicValue)
    println(counter.defaultValue)
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
    p1.address = "abc"
    println(p1.address)

    p1.trueAge = 20
    p1.trueAge = 14
    println(p1.trueAge)  //  20

    p1.backAge = 30
    p1.backAge = 15
    println(p1.backAge) //  30
}

fun testCustomer() {
    //  Data classes
    val peter = Customer("Peter", "peter@example.com")

    //  Copying
    val peter2 = peter.copy()
    val peter3 = peter.copy(name = "")

    println(peter2)
    println(peter3)

    //  Component Function
    val (name, email) = peter
    println("name=$name,email=$email")
}

fun countClicks(window: JComponent) {
    var clickCount = 0
    var enterCount = 0

    window.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) {
            super.mouseClicked(e)
        }
    })
}