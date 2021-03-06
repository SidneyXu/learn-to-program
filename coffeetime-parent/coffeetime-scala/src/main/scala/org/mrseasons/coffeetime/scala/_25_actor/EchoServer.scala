package org.mrseasons.coffeetime.scala._25_actor

/**
 * Created by mrseasons on 2015/05/19.
 */

import akka.actor.Actor

//define an actor
class EchoServer extends Actor {
  def receive = {
    case msg: String => println("echo " + msg)
  }

  @throws[Exception](classOf[Exception])
  override def preStart(): Unit = {
    super.preStart()
    println("preStart")
  }
}
