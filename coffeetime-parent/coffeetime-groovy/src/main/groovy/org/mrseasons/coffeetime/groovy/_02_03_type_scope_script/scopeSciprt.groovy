package org.mrseasons.coffeetime.groovy._02_03_type_scope_script

/**
 * Created by mrseasons on 2015/2/5.
 */
//local scope
String hello = "hello"
def world = "world"

//binding scope
helloworld = "hello world"

void check() {
//    println hello     error
//    println world     error

    println(helloworld)
}

check()

println "${hello} ${world}, ${helloworld}"