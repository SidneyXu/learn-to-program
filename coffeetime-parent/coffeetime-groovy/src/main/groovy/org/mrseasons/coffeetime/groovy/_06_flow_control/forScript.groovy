package org.mrseasons.coffeetime.groovy._06_flow_control

/**
 * Created by mrseasons on 2015/2/5.
 */
def repeat(val) {
    for (i = 0; i < 5; i++) {
        println val
    }
    println()

    for (i in 0..<5) {
        println val
    }
}

repeat("Hello repeatFor")

def range = 0..4
println range.class         //class groovy.lang.IntRange
assert range instanceof List  // [0, 1, 2, 3, 4]
println range

range = 0..<4
println range               //[0, 1, 2, 3]
