package org.mrseasons.coffeetime.scala._28_implict_dsl

import java.util.Date

import org.json4s.JsonDSL._
import org.json4s.jackson.JsonMethods._

/**
 * Created by mrseasons on 4/13/15.
 */
object DSLExample {

  def main(args: Array[String]) {
    case class Twitter(id: Long, text: String, publishedAt: Option[java.util.Date])

    var twitters = Twitter(1, "hello scala", Some(new Date())) ::
      Twitter(2, "I like scala tour", None) :: Nil

    var json = ("twitters"
      -> twitters.map(
      t => ("id" -> t.id)
        ~ ("text" -> t.text)
        ~ ("published_at" -> t.publishedAt.toString())))

    println(pretty(render(json)))
  }
}
