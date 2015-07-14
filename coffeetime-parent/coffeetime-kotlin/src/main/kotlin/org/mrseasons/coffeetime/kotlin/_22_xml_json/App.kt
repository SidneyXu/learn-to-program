package org.mrseasons.coffeetime.kotlin._22_xml_json

import java.io.File
import javax.xml.parsers.DocumentBuilderFactory
import kotlin.dom.parseXml

/**
 * Created by mrseasons on 2015/07/13.
 */
fun main(args: Array<String>) {
    val f = File("coffeetime-kotlin/src/main/resources/weather.xml")

    println(f.exists())
    println(f.getAbsolutePath())

    val builder=DocumentBuilderFactory.newInstance().newDocumentBuilder()
    println(builder.parse(f))
//    val weather = parseXml(f, )
//    println(weather)
}
