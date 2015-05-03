package org.mrseasons.coffeetime.scala._15_trait

/**
 * Created by mrseasons on 2015/05/03.
 */
trait OutputLogger extends Logger {
  override def show(msg: String): Unit = println(msg)

  //override abstract method
  //must also declare as abstract method
  abstract override def log(msg: String): Unit = {
    super.log(msg)
  }
}
