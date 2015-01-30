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


