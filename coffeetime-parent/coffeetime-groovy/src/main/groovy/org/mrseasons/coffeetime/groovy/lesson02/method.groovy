package org.mrseasons.coffeetime.groovy.lesson02

/**
 * Created by mrseasons on 1/28/15.
 */

//default value
def say(name, word = "Hello ") {
    println word + name
}

say("Jack")
say("Mary", "Good bye ")