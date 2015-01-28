package org.mrseasons.coffeetime.groovy.lesson04

/**
 * Created by mrseasons on 1/28/15.
 */
//Range
def range = 0..4
println range.class
assert range instanceof List

def list = ["Groovy", "Java", "Scala"]
assert list instanceof Collection
assert list instanceof ArrayList

//add
list.add("Rust")
list << "Katlin"
list[10] = "Ruby"
println(list)
