package org.mrseasons.coffeetime.kotlin._24_delegation

/**
 * Created by mrseasons on 2015/06/10.
 */
//  Class Delegation
interface Base {
    fun println()
}

class BaseImpl(val x: Int) : Base {
    override fun println() {
        println(x)
    }
}

class Derived(b: Base) : Base by b


//  Delegated Properties
//  Kinds of properties
//lazy properties: the value gets computed only upon first access,
//observable properties: listeners get notified about changes to this property,
//storing properties in a map, not in separate field each.

class Delegate {
    fun get(thisRef: Any?, prop: PropertyMetadata): String {
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    fun set(thisRef: Any?, prop: PropertyMetadata, value: String) {
        println("$value has been assigned to '${prop.name} in $thisRef.'")
    }
}

class Example {
    var p: String by Delegate()
}

