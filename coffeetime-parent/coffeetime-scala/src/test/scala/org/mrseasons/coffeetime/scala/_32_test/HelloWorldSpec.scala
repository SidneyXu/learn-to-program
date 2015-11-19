package org.mrseasons.coffeetime.scala._32_test

import org.junit.runner.RunWith
import org.specs2._
import org.specs2.runner.JUnitRunner
import org.specs2.specification.core.SpecStructure
import specification._

/**
 * Created by mrseasons on 2015/05/25.
 */
@RunWith(classOf[JUnitRunner])
class HelloWorldSpec extends Specification with Groups{
//  "This is a specification for the 'Hello world' string".txt

//  "The 'Hello world' string should" >> {
//    "contain 11 characters" >> {
//      "Hello world" must haveSize(112)
//    }
//    "start with 'Hello'" >> {
//      "Hello world" must startWith("Hello")
//    }
//    "end with 'world'" >> {
//      "Hello world" must endWith("world")
//    }
//  }


  "hello world" - new group {
    eg := "Hello world" must haveSize(113)
    eg := "Hello world" must startWith("Hello")
    eg := "Hello world" must endWith("world")
  }

  override def is: SpecStructure = "afafafa"
}