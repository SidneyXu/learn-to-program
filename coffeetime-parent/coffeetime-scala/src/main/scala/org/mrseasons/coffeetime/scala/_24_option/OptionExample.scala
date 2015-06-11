package org.mrseasons.coffeetime.scala._25_option

/**
 * Created by mrseasons on 2015/05/16.
 */
object OptionExample {
  def main(args: Array[String]) {

    val osName = getProperty("os.name")

    //pattern match
    osName match {
      case Some(value) => println(value)
      case _ => println("none")
    }

    println(osName.getOrElse("none"))

    // use option like a one length long list
    osName.foreach(print _)
  }

  //return an option
  def getProperty(name: String): Option[String] = {
    val value = System.getProperty(name)
    Option(value)
    //  if (value != null) Some(value) else None
  }

}
