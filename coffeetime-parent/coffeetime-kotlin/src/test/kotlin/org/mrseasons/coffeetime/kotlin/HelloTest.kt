package hello.tests

import hello.getHelloString
import junit.framework.TestCase
import kotlin.test.assertEquals

class HelloTest : TestCase() {
    fun testAssert() : Unit {
        assertEquals("Hello, world!", getHelloString())
    }
}
