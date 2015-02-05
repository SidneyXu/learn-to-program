package org.mrseasons.coffeetime.groovy._02_scope

/**
 * Created by mrseasons on 2/5/15.
 */
//本地域
String hello = "hello"
def world = "world"

//绑定域
helloworld = "hello world"

void check() {
//    println hello     error
//    println world     error

    println(helloworld)
}

check()

println "${hello} ${world}, ${helloworld}"