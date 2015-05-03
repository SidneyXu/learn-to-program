package org.mrseasons.coffeetime.scala._15_trait

/**
 * Created by mrseasons on 2015/05/03.
 */
class ConsoleLogger extends Logger with Cloneable with Serializable {
  //override abstract field
  val minLength: Int = 1

  //override abstract method
  def log(msg: String): Unit = println(msg)
}
