package org.mrseasons.coffeetime.scala._15_trait

/**
 * Created by mrseasons on 2015/05/03.
 */
trait Logger {
  //field
  val minLength: Int

  //method
  //trait can has abstract methods and normal methods
  //normal method
  def echo(msg: String) {
    println(msg)
  }

  def show(msg: String) {}

  //abstract method
  def log(msg: String)

  //depends on abstract method
  def info(msg: String) {
    log("[INFO]" + msg)
  }
}
