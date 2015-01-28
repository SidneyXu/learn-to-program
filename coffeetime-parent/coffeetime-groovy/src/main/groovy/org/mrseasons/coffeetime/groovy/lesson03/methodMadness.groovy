package org.mrseasons.coffeetime.groovy.lesson03

/**
 * Created by mrseasons on 1/28/15.
 */

//for
def repeatFor(val) {
    for (i = 0; i < 5; i++) {
        println val
    }
    //output 5 times
}

repeatFor("Hello repeatFor")

//scope in for
def repeatScope01(val) {
    for (i in 0..5) {
        println val
    }
    //output 6 times
}

repeatScope01("Hello repeatScope01")

def repeatScope02(val) {
    for (i in 0..<5) {
        println val
    }
    //output 5 times
}

repeatScope02("Hello repeatScope02")

def repeatScope03(val) {
    for (i in "a".."e") {
        println val + "-" + i
    }
    //output 5 times
}

repeatScope03("Hello repeatScope03")

