package org.mrseasons.coffeetime.scala._14_inherit

/**
 * Created by mrseasons on 2/15/15.
 */
class Person(val name: String) {

  //override not abstract method
  override def toString = getClass.getName() + "[name=" + name + "]"

  //protected access
  protected def info = name

  //protected+ package access
  protected[_14_inherit] def info2 = name

  //override
  def idf = "PersonDef"

  def idf2 = "PersonDef2"

  val id = "PersonVal"

  var x = "PersonVar"

}
