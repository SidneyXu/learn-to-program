package org.mrseasons.coffeetime.groovy._10_collection

/**
 * Created by mrseasons on 2/6/15.
 */
//---List---
def list = ["Groovy", "Java", "Scala"]
assert list instanceof Collection
assert list instanceof ArrayList

def emptyList = []
println emptyList

// add elements
list.add("Rust")
list << "Katlin"
list[10] = "Ruby"
list.putAt(9, "Python")
println list            //[Groovy, Java, Scala, Rust, Katlin, null, null, null, null, null, Python, Ruby]

//access element
println list[2]         //Scala
println list.get(2)     //Scala
println list[-1]        //Ruby

// create new list
def newList = list - ["Ruby", "Rust", "Katlin"] + "Swift"
println list            //[Groovy, Java, Scala, Rust, Katlin, null, null, null, null, null, Ruby]
println newList           //[Groovy, Java, Scala, null, null, null, null, null, Swift]

//index
println list[-1..-2]    //[Ruby, Python]

//spread operator
def numbers = [1, 2, 3, 4, 3, 4]
def numbers2 = numbers*.plus(10)
println(numbers)            //[1, 2, 3, 4, 3, 4]
println(numbers2)           //[11, 12, 13, 14, 13, 14]

// other operators
println numbers.join(",")   //1,2,3,4,3,4
println numbers.count(3)    //2

list = [1, 2, 3, [4, 5]]
println list.flatten()                  //[1, 2, 3, 4, 5]
println list.intersect([3, 4, 5])       //[3]
println list.pop()                      //[4, 5]
println list.reverse()                  //[3, 2, 1]
println list.sort()                     //[1, 2, 3]

