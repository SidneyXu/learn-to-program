package org.mrseasons.coffeetime.scala._27_actor

/**
 * Created by mrseasons on 4/9/15.
 */

import akka.actor.{Actor, ActorSystem, Props}

class EchoServer extends Actor {
  def receive = {
    case msg: String => println("echo " + msg)
  }

  @throws[Exception](classOf[Exception])
  override def preStart(): Unit = {super.preStart(); println("preStart")}
}
