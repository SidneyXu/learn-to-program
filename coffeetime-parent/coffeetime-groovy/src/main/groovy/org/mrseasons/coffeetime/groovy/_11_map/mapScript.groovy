package org.mrseasons.coffeetime.groovy._11_map

/**
 * Created by mrseasons on 2015/2/6.
 */
//---Map---
//constructor, key can be literal or string
def map = [name: "Peter", "age": 12, "national": "USA"]
println map.getClass()      //class java.util.LinkedHashMap

//empty map
def emptyMap = [:]

//map.put(uid, 1000)    error
map.put("id", 10)
println map.get("id")       //10

map.sex = "boy"
println map.sex             //boy

//map[height]=100   error
map["height"] = 180
println map["height"]       //180
