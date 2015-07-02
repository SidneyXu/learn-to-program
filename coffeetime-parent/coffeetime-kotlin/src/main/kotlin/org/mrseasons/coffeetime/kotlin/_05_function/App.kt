package org.mrseasons.coffeetime.kotlin._05_function

/**
 * Created by mrseasons on 2015/06/03.
 */
fun main(args: Array<String>) {

    //  call functions
    println(five())

    //  Default Arguments
    println(decorate("abc"))    //  [abc]

    //  Named Arguments
    println(decorate("abc", right = ">"))   //  [abc>

    //  Variable Arguments
    println(capitalizeAll("a", "b", "c"))  //  [A, B, C]

    // use * to pass contents of an array to the function
    val array = arrayOf("d", "e", "f")
    println(capitalizeAll("a", "b", "c", *array))   //  [A, B, C, D, E, F]
}

//  define functions
fun addOne(m: Int): Int = m + 1

fun addTwo(m: Int): Int {
    return m + 2
}

fun five(): Int {
    val x = 2 + 3
    val y = 3 + 2
    return x + y
}

//  Named Arguments
fun decorate(str: String, left: String = "[", right: String = "]") = left + str + right

//  Variable Arguments
fun capitalizeAll(vararg args: String): List<String> {
    return args.map { arg ->
        arg.capitalize()
    }
}

//  Sub
fun echo(s: String): Unit {
    println(s)
}

fun echo2(s: String) {
    println(s)
}

//  For public functions the return type can't be omitted
public fun sum(a: Int, b: Int): Int = a + b

//  The default visibility is 'internal' meaning "visible inside a module"
internal fun ibar() = 57