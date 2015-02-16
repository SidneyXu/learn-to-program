package org.mrseasons.coffeetime.scala._15_trait

/**
 * Created by mrseasons on 2/16/15.
 */
trait OutputLogger extends Logger {
  override def show(msg: String): Unit = println(msg)

  abstract override def log(msg: String): Unit = {
    super.log(msg)
  }
}
