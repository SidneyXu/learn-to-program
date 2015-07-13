package org.mrseasons.coffeetime.kotlin._22_xml_json

import java.io.File
import kotlin.dom.parseXml

/**
 * Created by mrseasons on 2015/07/13.
 */
fun main(args: Array<String>) {
    val f = File("coffeetime-kotlin/src/main/resources/weather.xml")

    println(f.exists())
    println(f.getAbsolutePath())

    val weather = parseXml(f)
    println(weather)
}
