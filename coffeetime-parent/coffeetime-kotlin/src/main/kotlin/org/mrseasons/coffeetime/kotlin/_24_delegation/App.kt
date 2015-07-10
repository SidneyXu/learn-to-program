package org.mrseasons.coffeetime.kotlin._24_delegation

import kotlin.properties.Delegates

/**
 * Created by mrseasons on 2015/06/10.
 */
fun main(args: Array<String>) {
    //  Class Delegation
    val b = BaseImpl(19)
    b.println() //  19

    /*
     *  The by-clause in the supertype list for Derived indicates that b will be stored internally in objects of Derived and the
     *   compiler will generate all the methods of Base that forward to b .
     */
    Derived(b).println()    //  19

    //  Delegated Properties
    val e = Example()
    println(e.p)

    e.p = "NEW"
    println(e.p)

    //  Standard Delegates
    //  Lazy
    /*
        Delegates.lazy() is a function that takes a lambda and returns a delegate that implements a lazy property:
        the first call to get() executes the lambda passed to lazy() and remembers the result,
        subsequent calls to get() simply return the remembered result.
     */
    println(lazy)
    println(lazy)
    //  blockingLazy() is thread safety
    println(blockLazy)

    //  Observable
    /*
        Delegates.observable() takes two arguments: initial value and a handler for modifications. The handler gets called
        every time we assign to the property (before the assignment is performed). It has three parameters: a property being
        assigned to, the old value and the new one:
     */
    val user = User()
    user.name = "first"
    user.name = "second"
    // If you want to be able to intercept an assignment and “veto” it, use vetoable() instead of observable()

    //  Not null
    /*
        Sometimes we have a non-null var, but we don’t have an appropriate value to assign to it in the constructor, i.e. it must be
        assigned later. The problem is that you can’t have an uninitialized non-abstract property in Kotlin:
        We could initialize it with null, but then we’d have to check every time we access it.
        Delegates.notNull() can solve this problem:
     */
    val foo = NotNullFoo()
    foo.bar

    //  Storing Properties in a Map
    /*
        Delegates.mapVal() takes a map instance and returns a delegate that reads property values from this map, using
        property name as a key. There are many use cases of this kind in applications like parsing JSON or doing other “dynamic”
        things:
     */
    val account = Account(mapOf(
            "name" to "John",
            "age" to 25
    ))
    //For var’s we can use mapVar() (note that it takes a MutableMap instead of read-only Map ).
}

val lazy: String by lazy {
    println("computed!")
    "Hello"
}

val blockLazy: String by Delegates.blockingLazy {
    println("computed2!")
    "Hello2"
}

class User {
    var name: String by Delegates.observable("<no name>") {
        d, old, new ->
        println("$old -> $new")
    }
}

class NotNullFoo {
    var bar: String by Delegates.notNull()
}

class Account(val map: Map<String, Any?>) {
    val name: String by Delegates.mapVal(map)
    val age: Int by Delegates.mapVal(map)
}