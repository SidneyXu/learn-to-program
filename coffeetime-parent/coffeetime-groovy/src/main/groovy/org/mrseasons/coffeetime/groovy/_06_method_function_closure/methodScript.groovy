package org.mrseasons.coffeetime.groovy._06_method_function_closure

/**
 * Created by mrseasons on 1/28/15.
 */

//default value
def say(name, word = "Hello ") {
    println word + name
}

say("Jack")
say("Mary", "Good bye ")



//regex
def pattern = /1010/
def input = "1010"
def matcher = input =~ pattern
if (input ==~ pattern) {
    input = matcher.replaceFirst("0101")
    println(input)      //0101
}

