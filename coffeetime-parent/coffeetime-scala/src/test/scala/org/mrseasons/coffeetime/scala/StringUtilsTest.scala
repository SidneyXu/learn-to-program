package org.mrseasons.coffeetime.scala

import org.junit.runner.RunWith
import org.scalatest.{BeforeAndAfter, FunSuite}
import org.scalatest.junit.JUnitRunner

/**
 * Created by mrseasons on 4/13/15.
 */
@RunWith(classOf[JUnitRunner])
class StringUtilsTest extends FunSuite with BeforeAndAfter{

  test("splitCamelCase works on FooBarBaz") {
    val s = StringUtils.splitCamelCase("FooBarBaz")
    assert(s.equals("Foo Bar Baz"))
  }

  test("splitCamelCase works on a blank string") {
    val s = StringUtils.splitCamelCase("")
    assert(s.equals(""))
  }

  test("splitCamelCase fails with a null") {
    val e = intercept[NullPointerException] {
      val s = StringUtils.splitCamelCase(null)
    }
    assert(e != null)
  }

}
