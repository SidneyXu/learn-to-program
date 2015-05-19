package org.mrseasons.coffeetime.scala._27_actor

import akka.actor.{Actor, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

/**
 * Created by mrseasons on 2015/05/19.
 */
object RemoteActorExample {

  def main(args: Array[String]) {

    implicit val system = akka.actor.ActorSystem("RemoteSystem",
      ConfigFactory.load.getConfig("remote"))
    class EchoServer extends Actor {
      def receive = {
        case msg: String => println("echo " + msg)
      }
    }

    val server = system.actorOf(Props[EchoServer], name = "echoServer")

    val echoClient = system.actorSelection("akka://RemoteSystem@127.0.0.1:2552/user/echoServer")
    echoClient ! "Hi Remote"

    system.shutdown

  }
}
