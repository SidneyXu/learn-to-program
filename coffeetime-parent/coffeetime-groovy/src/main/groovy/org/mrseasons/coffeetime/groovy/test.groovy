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

matcher.replaceAll()

def source = "||100tjs.com"
        .replaceAll(/\*+/, "*")        // remove multiple wildcards
        .replaceAll(/\^\|$/, "^")       // remove anchors following separator placeholder
        .replaceAll(/\W/, "\\\$&")      // escape special symbols
        .replaceAll(/\\\*/, ".*")      // replace wildcards by .*
// process separator placeholders (all ANSI characters but alphanumeric characters and _%.-)
        .replaceAll(/\\\^/, "(?:[\\x00-\\x24\\x26-\\x2C\\x2F\\x3A-\\x40\\x5B-\\x5E\\x60\\x7B-\\x7F]|\$)")
        .replaceAll(/^\\\|\\\|/, "^[\\w\\-]+:\\/+(?!\\/)(?:[^\\/]+\\.)?") // process extended anchor at expression start
        .replaceAll(/^\\\|/, "^")       // process anchor at expression start
        .replaceAll(/\\\|$/, "\$")       // process anchor at expression end
        .replaceAll(/^(\.\*)/, "")      // remove leading wildcards
        .replaceAll(/(\.\*)$/, "")     // remove trailing wildcards
println(source)

def aa = /[\\w\\-]+:\\/+(?!\\/)(?:[^\\/]+\\.)?ab\\.ahlife\\.com\\(?:[x00-x24x26-x2Cx2Fx3A-x40x5B-x5Ex60x7B-x7F]|)\\*\\.swf/

"a".replace()

