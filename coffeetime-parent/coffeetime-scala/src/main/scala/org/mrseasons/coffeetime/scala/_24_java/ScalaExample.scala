package org.mrseasons.coffeetime.scala._24_java

/**
 * Created by mrseasons on 4/13/15.
 */
object ScalaExample {

  def info = println("scala");

  def get(name: String) = new ScalaExample(name)

}

class ScalaExample(val name: String) {
}
