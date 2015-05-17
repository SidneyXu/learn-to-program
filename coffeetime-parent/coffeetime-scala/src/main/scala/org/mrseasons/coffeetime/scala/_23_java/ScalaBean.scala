package org.mrseasons.coffeetime.scala._23_java

import scala.beans.BeanProperty

/**
 * Created by mrseasons on 2015/05/16.
 */
class ScalaBean(@BeanProperty var name: String) {
  def say = "hello scala"
}
