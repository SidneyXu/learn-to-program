package org.mrseasons.coffeetime.kotlin.object_expression_3

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.JComponent

/**
 * Created by mrseasons on 2015/06/10.
 */
fun main(args: Array<String>) {

    //   like Java’s anonymous inner classes,
    val ab = object : A(1), B {
        override val y: Int
            get() = 15
    }

    //   “just an object”, with no nontrivial supertypes
    val adHoc = object {
        var x: Int = 1
        var y: Int = 2
    }

    println(ab.y)
    println(adHoc.x)

    //  Object
    val my = MyClass.create()
}

fun countClicks(window: JComponent) {
    var clickCount = 0
    var enterCount = 0

    window.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) {
            super.mouseClicked(e)
        }
    })
}
