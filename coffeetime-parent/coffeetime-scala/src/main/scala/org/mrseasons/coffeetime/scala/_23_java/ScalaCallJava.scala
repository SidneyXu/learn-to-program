package org.mrseasons.coffeetime.scala._23_java

/**
 * Created by mrseasons on 2015/05/16.
 */
object ScalaCallJava extends App {

  val bean = new JavaBean("JavaBean")
  println(bean.getName)
  println(bean.say())

}
