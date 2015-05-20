package org.mrseasons.coffeetime.scala._25_actor

import akka.actor.{ActorSystem, Props}

/**
 * Created by mrseasons on 2015/05/19.
 */
object RemoteServer extends App {

  implicit val system = ActorSystem("RemoteSystem")
  val remoteActor = system.actorOf(Props[EchoServer], name = "remoteServer")
  remoteActor ! "The RemoteActor is alive"

}
