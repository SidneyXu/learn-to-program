package org.mrseasons.coffeetime.kotlin._14_inherit

/**
 * Created by mrseasons on 2015/06/06.
 */
//  By default, all classes are final classes
//  parent has primary constructor
open class Person(name: String) {
    open fun idf() {
    }

    open fun idf2() {
    }
}

class Employee(name: String) : Person(name) {
    constructor(name: String, age: Int) : this(name) {

    }

    // override method is not final method
    override fun idf() {
        super.idf()
    }

    final override fun idf2() {
        super.idf2()
    }
}

// parent has no primary constructor
open class View {
    constructor(size: Int)
}

class TextView : View {
    constructor(size: Int) : super(size)
}