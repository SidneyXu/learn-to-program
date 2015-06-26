package hello.tests

import junit.framework.TestCase
import org.mrseasons.coffeetime.kotlin._01_hello.getHelloString
import kotlin.test.assertEquals

class HelloTest : TestCase() {
    fun testAssert() : Unit {
        assertEquals("Hello, world!", getHelloString())
    }
}
