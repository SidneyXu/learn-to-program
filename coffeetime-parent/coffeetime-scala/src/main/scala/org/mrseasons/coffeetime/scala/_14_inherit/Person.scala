package org.mrseasons.coffeetime.scala._14_inherit

/**
 * Created by mrseasons on 2015/2/15.
 */
class Person(val name: String) {

  //override not abstract method
  override def toString = getClass.getName + "[name=" + name + "]"

  //override
  val id = "PersonVal"
  var x = "PersonVar"
  def idf = "PersonDef"

  def idf2 = "PersonDef2"

  //protected access
  protected def info = name

  //protected + package access
  protected[_14_inherit] def info2 = name

}
