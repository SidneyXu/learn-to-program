package org.mrseasons.coffeetime.scala._19_regex

/**
 * Created by mrseasons on 2/16/15.
 */
object RegexExample {

  def main(args: Array[String]) {
    val numPattern = "[0-9]+".r
    val wsnumPattern = """\s+[0-9]+\s+""".r
    for (matchString <- numPattern.findAllIn("99 bottles, 98 bottles")) {
      println(matchString)
    }
    println() //99 98

    val first = numPattern.findFirstIn("99 bottles, 98 bottles")
    println(first) //Some(99)

    val isMatched = numPattern.findPrefixOf("99 bottles, 98 bottles")
    println(isMatched) //Some(99)

    val result = numPattern.replaceAllIn("99 bottles, 98 bottles", "xxx")
    println(result) //xxx bottles, xxx bottles

  }
}
