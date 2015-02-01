package org.mrseasons.coffeetime.groovy.lesson01

/**
 * Created by mrseasons on 2015/2/2.
 */
Integer x = new Integer(2)
Integer y = new Integer(2)
Integer z

println x == y    //true
println x.is(y) //false
println z == null //true
println z.is(null)  //true