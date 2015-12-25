package org.mrseasons.coffeetime.kotlin._04_nullable_operator

/**
 * Created by mrseasons on 2015/07/02.
 */
fun main(args: Array<String>) {
    //  Null Safety
    /*
        In Java this would be the equivalent of a NullPointerException or
        NPE for short.
        Kotlin’s type system is aimed to eliminate NullPointerException ’s from our code.
        The only possible causes of NPE’s may beAn explicit call to throw NullPointerException()
     */
    //  Nullable types and Non-Null Types
    //  ? is used to declare a variable that allow nulls
    var a: String = "abc"
    //    a=null    error
    var b: String? = "abc"
    b = null

    a.length  //  ok, a is not null
    //    b.length()    error, that would not be safe

    //  The ways to call method on nullable variable
    //    Checking for null in conditions
    val arr = arrayOf("1", "2")
    val x = parseInt(arr[0])
    val y = parseInt(arr[1])
    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        print(x * y)
    }

    // Safe Calls
    //  ?.  is used to call method is variable is not null, otherwise return null.
    val len: Int? = b?.length

    //  Elvis Operator
    //  if is not null, use it, otherwise use another non-null value
    var l = b?.length ?: -1
    val foo = a.length > 3 ?: throw IllegalArgumentException("name expected")

    //  The !! Operator
    //  return a non-null value or throw NPE if is null
    l = b!!.length

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
        return obj.length
    }
    // `obj` is still of type `Any` outside of the type-checked branch
    return null
}

