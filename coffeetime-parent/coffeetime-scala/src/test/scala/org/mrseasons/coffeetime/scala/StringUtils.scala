package org.mrseasons.coffeetime.scala

/**
 * Created by mrseasons on 4/13/15.
 */
object StringUtils {

  def splitCamelCase(s: String): String = {
    return s.replaceAll(
      String.format("%s|%s|%s",
        "(?<=[A-Z])(?=[A-Z][a-z])",
        "(?<=[^A-Z])(?=[A-Z])",
        "(?<=[A-Za-z])(?=[^A-Za-z])"
      ),
      " "
    ).replaceAll("  ", " ")
  }

}