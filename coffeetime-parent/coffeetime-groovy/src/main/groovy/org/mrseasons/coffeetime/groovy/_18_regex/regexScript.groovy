package org.mrseasons.coffeetime.groovy._18_regex

/**
 * Created by mrseasons on 2/6/15.
 */
def pattern = /1010/
def input = "1010"
def matcher = input =~ pattern
if (input ==~ pattern) {
    input = matcher.replaceFirst("0101")
    println(input)      //0101
}

