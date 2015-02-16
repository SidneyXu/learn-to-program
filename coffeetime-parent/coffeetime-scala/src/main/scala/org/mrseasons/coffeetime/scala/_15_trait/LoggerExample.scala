package org.mrseasons.coffeetime.scala._15_trait

/**
 * Created by mrseasons on 2/16/15.
 */
object LoggerExample {

  def main(args: Array[String]) {
    val logger1 = new LoggerExample
    logger1.say("hello")

    //add trait to an object
    val logger2 = new LoggerExample with OutputLogger
    logger2.say("hello world") //hello world

    val logger3 = new LoggerExample with OutputLogger with TimeStampLogger with ShortLogger
    logger3.show("hello world logger3") //Mon Feb 16 11:46:06 CST 2015 hello world ...
    val logger4 = new LoggerExample with OutputLogger with ShortLogger with TimeStampLogger
    logger4.show("hello world logger4") //Mon Feb 16 1...
  }
}

class LoggerExample extends Logger {
  override def log(msg: String): Unit = println(msg)

  def say(msg: String): Unit = {
    show(msg)
  }

  override val minLength: Int = 1
}
