package org.mrseasons.coffeetime.groovy._06_method_function_closure

/**
 * Created by mrseasons on 2015/2/6.
 */
//list
def acoll = ["Groovy", "Java", "Ruby"]
acoll.each {
    println it
}
acoll.each { value ->
    println value
}

//map
def map = [name: "Peter", age: 20]
map.each {
    println "$it.key=$it.value"
}
map.each { key, value ->
    println "$key=$value"
}

//String
"Hello World".each {
    print it + ","
}
println()

//function literal
def excite = { word ->
    return "${word}!!"
}
assert "Groovy!!" == excite("Groovy")
assert "Java!!" == excite.call("Java")

def learn = {
    return it
}
assert "Groovy" == learn("Groovy")

//error
//def learn2={
//    return it
//}
//"it" is only used for one parameter
//println learn2("ab","cd","ef")