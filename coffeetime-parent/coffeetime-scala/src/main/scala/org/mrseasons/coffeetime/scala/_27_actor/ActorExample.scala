package org.mrseasons.coffeetime.scala._27_actor

import java.util.concurrent.TimeUnit

import akka.actor.{Props, ActorSystem}
import akka.actor.ActorDSL._
import akka.testkit.CallingThreadDispatcher
import akka.pattern.ask

/**
 * Created by mrseasons on 4/9/15.
 */
object ActorExample {

  def main(args: Array[String]) {
    testBlockOperation()
  }

  def testEchoServer(): Unit = {
    //Creating Actors with default constructor
    val system = ActorSystem()
    val echoServer = system.actorOf(Props[EchoServer])

    echoServer ! "hi"

    system.shutdown
  }

  def testEchoServerUsingDSL(): Unit = {
    implicit val system = ActorSystem()

    val echoServer = actor(new Act {
      become {
        case msg => println("echo " + msg)
      }

    })
    echoServer ! "hi"
    system.shutdown
  }

  def testActorAndThread(): Unit = {
    implicit val system = ActorSystem()

    val echoServers = (1 to 10).map(x =>
      system.actorOf(Props(new EchoServer2(x.toString))
        .withDispatcher(CallingThreadDispatcher.Id)))
    (1 to 10).foreach(msg =>
      echoServers(scala.util.Random.nextInt(10)) ! msg.toString)

    system.shutdown
  }

  def testBlockOperation(): Unit = {
    implicit val ec = scala.concurrent.ExecutionContext.Implicits.global
    implicit val system = akka.actor.ActorSystem()

    val versionUrl = "https://github.com/SidneyXu"
    //    val versionUrl = "https://raw.github.com/scala/scala/master/starr.number"

    val fromURL = actor(new Act {
      become {
        case url: String => sender ! scala.io.Source.fromURL(url)
          .getLines().mkString("\n")
      }
    })

    val version = fromURL.ask(versionUrl)(akka.util.Timeout(5, TimeUnit.SECONDS))
    version.foreach(println _)

    system.shutdown
  }

  def testConcurrentOperation(): Unit = {

  }

}
