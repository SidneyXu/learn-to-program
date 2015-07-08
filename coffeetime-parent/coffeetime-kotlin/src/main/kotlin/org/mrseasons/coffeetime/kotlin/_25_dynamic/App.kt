package org.mrseasons.coffeetime.kotlin._25_dynamic

import javax.swing.text.html.HTML

/**
 * Created by mrseasons on 2015/06/29.
 */
//Dynamic Type
fun main(args: Array<String>) {
//   val dyn:dynamic = ...

}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()
    html.init()
    return html
}