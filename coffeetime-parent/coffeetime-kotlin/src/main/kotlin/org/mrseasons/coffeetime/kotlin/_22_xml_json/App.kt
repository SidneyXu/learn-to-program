package org.mrseasons.coffeetime.kotlin._22_xml_json

import java.io.File
import javax.xml.parsers.DocumentBuilderFactory
import kotlin.dom.toXmlString

/**
 * Created by mrseasons on 2015/07/13.
 */
fun main(args: Array<String>) {
    val f = File("coffeetime-kotlin/src/main/resources/weather.xml")

    val builder = DocumentBuilderFactory.newInstance().newDocumentBuilder()
    println(builder.parse(f).toXmlString())
}
