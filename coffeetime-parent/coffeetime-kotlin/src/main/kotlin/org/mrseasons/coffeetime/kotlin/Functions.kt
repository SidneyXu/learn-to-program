package i_introduction._1_Functions

fun foo(s: String): String {
    fun localFoo(): Int {
        return 42
    }
    return s + localFoo()
}

//If a function returns a simple expression, you can use "=" and omit the return type.
fun bar() = 43

//For public functions the return type can't be omitted and should be specified explicitly.
public fun pbar(): Int = 45

//The default visibility is 'internal' meaning "visible inside a module".
internal fun ibar() = 57

