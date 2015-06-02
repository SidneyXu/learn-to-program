package hello

import org.mrseasons.coffeetime.kotlin.JavaHello

public val KotlinHelloString : String = "Hello from Kotlin!"

public fun getHelloStringFromJava() : String {
    return JavaHello.JavaHelloString!!;
}
