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

    a.length()  //  ok, a is not null
    //    b.length()    error, that would not be safe

    //  The ways to call method on nullable variable
    //    Checking for null in conditions
    var l = if (b != null) b.length() else -1

    // Safe Calls
    //  ?.  is used to call method is variable is not null, otherwise return null.
    val len: Int? = b?.length()

    //  Elvis Operator
    //  if is not null, use it, otherwise use another non-null value
    l = b?.length() ?: -1
    val foo = a.length() > 3 ?: throw IllegalArgumentException("name expected")

    //  The !! Operator
    //  return a non-null value or throw NPE if is null
    l = b!!.length()
}





//The third option is for NPE-lovers.
// We can write b!! , and this will return a non-null value of b
// (e.g., a String in our
//        example) or throw an NPE if b is null:
//val l = b!!.length()
//Thus, if you want an NPE, you can have it, but you have to ask for it explicitly,
// and it does not appear out of the blue.
//By the way, !! is added for conciseness,
// and formerly was emulated by an extension function from the standard library,
//defined as follows:
//inline fun <T : Any> T?.sure(): T =
//        if (this == null)
//         throw NullPointerException()
//        else
//         this