package org.mrseasons.coffeetime.groovy._06_method_function_closure

/**
 * Created by mrseasons on 2/6/15.
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

//函数字面值
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
//参数大于1个，不能使用it
//println learn2("ab","cd","ef")