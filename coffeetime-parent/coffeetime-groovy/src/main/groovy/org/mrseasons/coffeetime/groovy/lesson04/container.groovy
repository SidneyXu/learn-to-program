package org.mrseasons.coffeetime.groovy.lesson04

/**
 * Created by mrseasons on 1/28/15.
 */
//---Range---
def range = 0..4
println range.class         //class groovy.lang.IntRange
assert range instanceof List

//---List---
def list = ["Groovy", "Java", "Scala"]
assert list instanceof Collection
assert list instanceof ArrayList

// operations
list.add("Rust")
list << "Katlin"
list[10] = "Ruby"
println list            //[Groovy, Java, Scala, Rust, Katlin, null, null, null, null, null, Ruby]
println list[2]         //Scala

list + "Swift"
def nlist = list - ["Ruby", "Rust", "Katlin"]
println list            //[Groovy, Java, Scala, Rust, Katlin, null, null, null, null, null, Ruby]
println nlist           //[Groovy, Java, Scala, null, null, null, null, null]

def numbers = [1, 2, 3, 4, 3, 4]
println numbers.join(",")   //1,2,3,4,3,4
println numbers.count(3)    //2

//spread operator
def numbers2 = numbers*.plus(10)
println(numbers)            //[1, 2, 3, 4, 3, 4]
println(numbers2)           //[11, 12, 13, 14, 13, 14]

//---Map---
def map = [name: "Peter", "age": 12, "national": "USA"]
println map.getClass()      //class java.util.LinkedHashMap

//map.put(uid, 1000)    error
map.put("id", 10)
println map.get("id")       //10

map.sex = "boy"
println map.sex             //boy

//map[height]=100   error
map["height"] = 180
println map["height"]       //180



