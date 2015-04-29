package org.mrseasons.coffeetime.scala._12_class

/**
 * Created by mrseasons on 2015/2/12.
 */
object MyBeanExample {
  def main(args: Array[String]) {
    def my = new MyBean
    println(my.name)
    my.name = "def"
    println(my.getName)
    println(my.setName("abc"))
  }
}
