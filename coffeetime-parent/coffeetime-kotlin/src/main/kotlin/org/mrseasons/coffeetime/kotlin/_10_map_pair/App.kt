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

    //  access an element
    println(mMap.get("d"))

    //  access an not exist key would throw an exception
    //    println(mMap.get("e"))
    val x = if (mMap.containsKey("e")) mMap.get("e") else 0
    println(mMap.getOrElse("e", { 10 }))

    //  update elements
    mMap.put("d", 20)
    mMap.remove("c")
    println(mMap)

    //  traversing a map
    for ((k, v)in map) {
        println("$k -> $v")
    }

    val keys = map.keySet()
    val values = map.values()
    for (k in keys) {

    }

    //  Multi-Declarations
    val person = Person("Jane", 20)
    val  (name, age) = person
    val pname = person.component1()
    println(name.toString() + ", " + age + ", " + pname)    //  Jane, 20, Jane

}

class Person(val name: String, val age: Int) {
    operator fun component1(): String {
        return name
    }

    operator fun component2(): Int {
        return age
    }
}