package org.mrseasons.coffeetime.kotlin._19_regex

/**
 * Created by mrseasons on 2015/07/13.
 */
fun main(args: Array<String>) {
    val numPattern = "[0-9]+".toRegex()
    for (matchResult in numPattern.findAll("99 bottles, 98 bottles")) {
        println(matchResult.value)
    }
    println() //99 98

    val first = numPattern.find("99 bottles, 98 bottles")
    println(first?.value) //99

    val result = numPattern.replace("99 bottles, 98 bottles", "xxx")
    println(result) //xxx bottles, xxx bottles

}