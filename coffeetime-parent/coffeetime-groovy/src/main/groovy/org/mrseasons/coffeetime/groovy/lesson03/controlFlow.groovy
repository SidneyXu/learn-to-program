package org.mrseasons.coffeetime.groovy.lesson03

/**
 * Created by mrseasons on 1/28/15.
 */
//for
def repeat(val) {
    for (i = 0; i < 5; i++) {
        println val
    }
    for (i in 0..< 5) {
        println val
    }
}

repeat("Hello repeatFor")