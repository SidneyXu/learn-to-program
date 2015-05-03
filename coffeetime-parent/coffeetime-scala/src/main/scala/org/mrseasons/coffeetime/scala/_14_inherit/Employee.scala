package org.mrseasons.coffeetime.scala._14_inherit

/**
 * Created by mrseasons on 2015/05/01.
 */
class Employee(name: String, salary: Int) extends Person(name) {


  //call method from super class
  override def toString: String = super.toString + "[salary=" + salary + "]"

  //access super protected fields
  def desc = super.info

  //override
  override val idf2: String = "val Override def"
  override val id: String = "val Override val"

  override def idf: String = "def Override def"

  //error
  //  override var x: String = "var Override var"
}
