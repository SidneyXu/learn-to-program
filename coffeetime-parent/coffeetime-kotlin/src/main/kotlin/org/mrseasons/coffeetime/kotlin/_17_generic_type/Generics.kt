package org.mrseasons.coffeetime.kotlin._17_generic_type

/**
 * Created by mrseasons on 2015/06/09.
 */
class Holder<T>(val t: T) {
    fun info() {
        println(t)
    }
}

//  Declaration-site variance
//  out
//  make sure that it is only returned (produced) from members of Source<T> , and never consumed
abstract class Source<out T> {
    abstract fun nextT(): T
}

//void demo(Source<String> strs) {
//    Source<Object> objects = strs; // !!! Not allowed in Java
//    // ...
//}

fun demo(strs: Source<String>) {
    //  This is ok since T is an out-parameter
    val obj: Source<Any> = strs
}

//  in
//  it can only be consumed and never produced
abstract class Comparable<in T> {
    abstract fun compareTo(other: T): Int
}

fun demo(x: Comparable<Number>) {
    x.compareTo(1.0)
    val y: Comparable<Double> = x // OK!
}

//  Type projections
//  Array<in String> corresponds to Java’s Array<? super String>
fun copy(from: Array<Any>, to: Array<Any>) {
    assert(from.size() == to.size())
    for (i in from.indices)
        to[i] = from[i]
}

