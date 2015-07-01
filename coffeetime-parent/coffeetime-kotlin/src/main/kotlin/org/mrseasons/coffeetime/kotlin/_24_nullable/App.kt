package org.mrseasons.coffeetime.kotlin._24_nullable

/**
 * Created by mrseasons on 2015/06/26.
 */
fun main(args: Array<String>) {

    //Nullable
    val arr = arrayOf("1", "2")
    val x = parseInt(arr[0])
    val y = parseInt(arr[1])
    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        print(x * y)
    }

    //Using type checks and automatic casts
    println(getStringLength("abc"))
    println(getStringLength(123))
}

// ? allow function return null
fun parseInt(str: String): Int? {
    return str.toInt()
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // `obj` is automatically cast to `String` in this branch
        return obj.length()
    }
    // `obj` is still of type `Any` outside of the type-checked branch
    return null
}

