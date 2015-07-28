package org.mrseasons.coffeetime.kotlin._24_delegation

import kotlin.properties.Delegates

/**
 * Created by mrseasons on 2015/06/10.
 */
fun main(args: Array<String>) {
    //  Class Delegation
    val b = BaseImpl(19)
    b.println() //  19
    Derived(b).println()    //  19

    //  Delegated Properties
    val e = Example()
    println(e.p)

    e.p = "NEW"
    println(e.p)

    //  Standard Delegates
    //  Kinds of properties
    //lazy properties: the value gets computed only upon first access,
    //observable properties: listeners get notified about changes to this property,
    //storing properties in a map, not in separate field each.

    //  Lazy
    println("lazy is ${lazy}")
    println("lazy is ${lazy}")

    //  blockingLazy() is thread safety
    println("blockLazy is ${blockLazy}")

    //  Observable
    val user = User()
    user.name = "first"
    user.name = "second"
    // If you want to be able to intercept an assignment and “veto” it,
    // use vetoable() instead of observable()
    user.age = 10
    println(user.age)
    user.age = 20
    println(user.age)

    //  Not null
    /*
        Sometimes we have a non-null var, but we don’t have an appropriate value to
         assign to it in the constructor, i.e. it must be
        assigned later. The problem is that you can’t have an uninitialized
         non-abstract property in Kotlin:
        We could initialize it with null, but then we’d have to check every time
         we access it.
        Delegates.notNull() can solve this problem:
     */
    val foo = NotNullFoo()
    foo.bar = "bar"

    //  Storing Properties in a Map
    /*
        Delegates.mapVal() takes a map instance and returns a delegate
         that reads property values from this map, using
        property name as a key. There are many use cases of this kind
        in applications like parsing JSON or doing other “dynamic”
        things:
     */
    val account = Account(mapOf(
            "name" to "John",
            "age" to 25
    ))
    println(account.name)
    println(account.age)
    //For var’s we can use mapVar() (note that it takes a MutableMap instead of
    // read-only Map ).
}

/*
    Delegates.lazy() is a function that takes a lambda and returns a delegate
    that implements a lazy property:
    the first call to get() executes the lambda passed to lazy()
    and remembers the result,
    subsequent calls to get() simply return the remembered result.
 */
val lazy: String by lazy {
    println("computed!")
    "Hello ${System.currentTimeMillis()}"
}

val blockLazy: String by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
    println("computed2!")
    "Hello2 ${System.currentTimeMillis()}"
}

/*
    Delegates.observable() takes two arguments: initial value
    and a handler for modifications. The handler gets called
    every time we assign to the property (before the assignment is performed).
     It has three parameters: a property being
    assigned to, the old value and the new one:
 */
class User {
    var name: String by Delegates.observable("<no name>") {
        d, old, new ->
        println("$old -> $new")
    }

    var age: Int by Delegates.vetoable(0) {
        d, old, new ->
        println("$old -> $new")
        if (new < 20) true else false
    }
}

class NotNullFoo {
    var bar: String by Delegates.notNull()
}

class Account(val map: Map<String, Any?>) {
    val name: String by Delegates.mapVal(map) {
        o, p ->
        println("$o -> $p")
        "default name"
    }
    val age: Int by Delegates.mapVal(map) {
        o, p ->
        println("$o -> $p")
        0
    }
}