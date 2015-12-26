package org.mrseasons.coffeetime.kotlin

import junit.framework.TestCase
import org.mrseasons.coffeetime.kotlin._01_hello.getHelloString

class HelloTest : TestCase() {
    fun testAssert() : Unit {
        assertEquals("Hello, world!", getHelloString())
    }
}
