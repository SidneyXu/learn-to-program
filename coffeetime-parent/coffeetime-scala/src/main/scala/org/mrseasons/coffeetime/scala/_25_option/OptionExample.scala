package org.mrseasons.coffeetime.scala._25_option

/**
 * Created by mrseasons on 4/8/15.
 */
object OptionExample {
  def main(args: Array[String]) {

    val osName = getProperty("os.name")

    osName match {
      case Some(value) => println(value)
      case _ => println("none")
    }

    println(osName.getOrElse("none"))

    // use option like a one length long list
    osName.foreach(print _)
  }

  def getProperty(name: String): Option[String] = {
    val value = System.getProperty(name)
    if (value != null) Some(value) else None
  }

}
