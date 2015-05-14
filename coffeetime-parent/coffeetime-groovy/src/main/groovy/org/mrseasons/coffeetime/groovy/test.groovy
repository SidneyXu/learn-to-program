package org.mrseasons.coffeetime.groovy

/**
 * Created by mrseasons on 2015/05/12.
 */
def pattern = /^([^\/\*\|\@"!]*?)#(\@)?(?:([\w\-]+|\*)((?:\([\w\-]+(?:[$^*]?=[^\(\)"]*)?\))*)|#([^{}]+))$/
def input = "bittorrent.am##[bgcolor=\"#66CCCC\"][style=\"background: rgb(126, 180, 224)\"]"
def matcher = input =~ pattern
matcher.find()
0.upto(matcher.groupCount()) { i ->
    println(matcher.group(i))
}

pattern=/\([\w\-]+(?:[$^*]?=[^\(\)"]*)?\)/
input=""""""
matcher = input =~ pattern
println(matcher.find())