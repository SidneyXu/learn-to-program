package org.mrseasons.coffeetime.kotlin._10_map_pair

/**
 * Created by mrseasons on 2015/06/30.
 */
fun main(args: Array<String>) {
    //  immutable map
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(map["a"])   //  1
    println(map.get("a"))   //  1

    //  mutable map
    val mMap = hashMapOf("a" to 1, "b" to 2, "c" to 3)
    mMap.put("d", 4)
    println(mMap)   //  {a=1, b=2, c=3, d=4}

    //  traversing a map
    for ((k, v)in map) {
        println("$k -> $v")
    }

    //  Multi-Declarations
//    val person=Person("Jane",20)
//    val (name,age)=person

}

//fun Person.component2(): Any {
//}
//
//class Person(val name:String, val age:Int){
//
//}