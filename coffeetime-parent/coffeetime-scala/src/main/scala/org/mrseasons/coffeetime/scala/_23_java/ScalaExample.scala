package org.mrseasons.coffeetime.scala._23_java

/**
 * Created by mrseasons on 2015/05/16.
 */
object ScalaExample {

  def info = println("scala");

  def get(name: String) = new ScalaExample(name)

}

class ScalaExample(val name: String) {
}
