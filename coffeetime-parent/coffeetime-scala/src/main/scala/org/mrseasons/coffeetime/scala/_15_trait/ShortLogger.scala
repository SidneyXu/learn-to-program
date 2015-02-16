package org.mrseasons.coffeetime.scala._15_trait

/**
 * Created by mrseasons on 2/16/15.
 */
trait ShortLogger extends Logger {
  val maxLength = 15

  override def show(msg: String): Unit = {
    super.show(
      if (msg.length <= maxLength) msg else msg.substring(0, maxLength - 3) + "..."
    )
  }
}
