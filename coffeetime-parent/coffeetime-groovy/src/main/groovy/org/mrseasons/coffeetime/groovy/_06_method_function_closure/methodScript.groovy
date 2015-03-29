package org.mrseasons.coffeetime.groovy._06_method_function_closure

/**
 * Created by mrseasons on 2015/1/28.
 */

//default value
def say(name, word = "Hello ") {
    println word + name
}

say("Jack")                 //Hello Jack
say("Mary", "Good bye ")    //Good bye Mary

//automatically return last sentence
def add(x, y) {
    x += x
    y += y
    x + y
}

assert 16 == add(3, 5)

