package org.mrseasons.coffeetime.kotlin._11_class

/**
 * Created by mrseasons on 2015/06/25.
 */
class Counter {
    private var value = 0
    var defaultValue = 1
    public var publicValue: Int = 2

    fun increment(): Unit {
        value += 1
    }

    fun current() = value
}