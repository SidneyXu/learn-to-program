package org.mrseasons.coffeetime.scala._15_trait

/**
 * Created by mrseasons on 2/16/15.
 */
class ConsoleLogger extends Logger with Cloneable with Serializable {
  def log(msg: String): Unit = println(msg)

  val minLength: Int = 1
}
