package org.mrseasons.coffeetime.scala

import org.specs2.mutable._

/**
 * Created by mrseasons on 2015/05/25.
 */
class HelloWorldSpec extends Specification {
  "This is a specification for the 'Hello world' string".txt

  "The 'Hello world' string should" >> {
    "contain 11 characters" >> {
      "Hello world" must haveSize(11)
    }
    "start with 'Hello'" >> {
      "Hello world" must startWith("Hello")
    }
    "end with 'world'" >> {
      "Hello world" must endWith("world")
    }
  }
}