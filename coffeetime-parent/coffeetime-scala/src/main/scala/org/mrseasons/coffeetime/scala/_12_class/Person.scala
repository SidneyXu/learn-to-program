package org.mrseasons.coffeetime.scala._12_class

import java.util.Date

/**
 * Created by mrseasons on 2/12/15.
 */
class Person {
  //default getter and setter
  var age = 0

  //specify getter and setter
  private var privateAge = 0

  def trueAge = privateAge

  def trueAge_=(pAge: Int): Unit = {
    if (pAge > privateAge) {
      privateAge = pAge
    }
  }

  //only getter
  val birthday = new Date()

  //object private fields
  private[this] var selfAge = 0

  def isYounger(other: Person) = age < other.age

  //error, is inaccessible
  //  def isYounger2(other:Person)=selfAge<other.selfAge


}
