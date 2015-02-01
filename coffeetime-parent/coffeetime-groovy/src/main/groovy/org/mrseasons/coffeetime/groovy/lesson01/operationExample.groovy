package org.mrseasons.coffeetime.groovy.lesson01

/**
 * Created by mrseasons on 2015/2/2.
 */
//安全引用操作符
//old
List<Person> people=[null, new Person(name: "Jack")]
for(Person person:people){
    if(person!=null){
        println person.name
    }
}

//new
for(Person person:people){
        println person?.name
}
people.each {
    println it.name
}