package org.mrseasons.coffeetime.groovy._21_io

/**
 * Created by mrseasons on 2015/2/9.
 */
//output
println("abc")
println "abc"
print 'abc'
println()

//input
print("enter your name:")
def name = new BufferedReader(new InputStreamReader(System.in)).readLine()
println "name is " + name

