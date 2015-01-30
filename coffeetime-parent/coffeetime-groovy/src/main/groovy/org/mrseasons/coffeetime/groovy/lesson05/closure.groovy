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



