package org.mrseasons.coffeetime.scala._15_trait

/**
 * Created by mrseasons on 2/16/15.
 */
trait Logger {
  //trait can has abstract methods and normal methods
  def log(msg: String)

  val minLength:Int

  def echo(msg: String) {
    println(msg)
  }

  def show(msg: String) {}

  def info(msg: String) {
    log("[INFO]" + msg)
  }
}
