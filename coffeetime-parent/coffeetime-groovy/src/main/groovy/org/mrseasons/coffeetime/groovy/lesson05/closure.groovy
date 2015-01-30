/**
 * Created by mrseasons on 2015/1/29.
 */
//list
def acoll = ["Groovy", "Java", "Ruby"]
acoll.each{
    println it
}
acoll.each{value->
    println value
}

//map
def map=[name:"Peter",age:20]
map.each {
    println "$it.key=$it.value"
}
map.each {key,value->
    println "$key=$value"
}

//String
def str="HelloWorld"
str.each {
    println(it)
}



=======
package org.mrseasons.coffeetime.groovy.lesson05

/**
 * Created by mrseasons on 1/30/15.
 */
def acoll=["Java","Groovy","Scala"]
acoll.each{
    println it
}
acoll.each{value->
    println value
}

def map=[name:"Peter",age:18]
map.each {
    println "${it.key}:${it.value}"
}

"Hello World".each {
    print it+","
}
println()

def excite = { word ->
    return "${word}!!"
}
assert "Groovy!!" == excite("Groovy")
assert "Java!!" == excite.call("Java")


>>>>>>> 213870f000b360792a686ff1949b111205e5fd6e
