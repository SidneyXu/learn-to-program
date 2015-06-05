package org.mrseasons.coffeetime.kotlin._11_class

/**
 * Created by mrseasons on 2015/06/05.
 */
//  primary constructor
//  var for mutable and val for read-only
class Man(val name: String, val age: Int, private var from: String = "USA", description: String = "none") {

    init {
        println("sentences in primary constructor")
    }

    //  slave constructor
    //  delegate to the primary constructor
    constructor(name: String) : this(name, 0) {
    }

    constructor(age: Int) : this("Default Name", age) {
    }

    constructor() : this("Default Name") {
    }
}

class Woman private constructor(val name: String, val age: Int) {
    constructor(name: String) : this(name, 0) {

    }
}