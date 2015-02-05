package org.mrseasons.coffeetime.groovy._07_flow_control

/**
 * Created by mrseasons on 2/5/15.
 */
def repeat(val) {
    for (i = 0; i < 5; i++) {
        println val
    }
    println()

    for (i in 0..< 5) {
        println val
    }
}

repeat("Hello repeatFor")