package org.mrseasons.coffeetime.scala._15_trait

import java.util.Date

/**
 * Created by mrseasons on 2015/05/03.
 */
trait TimeStampLogger extends Logger {
  override def show(msg: String): Unit = {
    super.show(new Date() + " " + msg)
  }
}
