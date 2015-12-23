package org.mrseasons.coffeetime.scala._25_actor

import java.util.concurrent.TimeUnit

import akka.actor.ActorDSL._
import akka.actor.{ActorSystem, Props}
import akka.pattern.ask
import akka.testkit.CallingThreadDispatcher

/**
 * Created by mrseasons on 2015/05/19.
 */
object ActorExample extends App {

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
      whenStarting {
        println("preStart")
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

    val fromURL = actor(new Act {
      become {

        case url: String => sender ! scala.io.Source.fromURL(url)
          .getLines().mkString("\n")
      }
    })

    val version = fromURL.ask(versionUrl)(akka.util.Timeout(5, TimeUnit.SECONDS))
    version.foreach(println)

    system.shutdown
  }

  def testConcurrentOperation(): Unit = {
    implicit val ec = scala.concurrent.ExecutionContext.Implicits.global
    implicit val system = akka.actor.ActorSystem()

    val versionUrl = "https://github.com/SidneyXu"

    val fromURL = actor(new Act {
      become {
        case url: String => sender ! scala.io.Source.fromURL(url)
          .getLines().mkString("\n")
      }
    })

    val version = fromURL.ask(versionUrl)(akka.util.Timeout(5, TimeUnit.SECONDS))
    version onComplete {
      case msg => println(msg); system.shutdown
    }

  }

  def testParallelProcessCollection(): Unit = {

    val urls = List("http://scala-lang.org",
      "https://github.com/SidneyXu")

    def fromURL(url: String) = scala.io.Source.fromURL(url)
      .getLines().mkString("\n")

    val t = System.currentTimeMillis()
//    urls.map(fromURL(_))
        urls.par.map(fromURL)

    println("time: " + (System.currentTimeMillis - t) + "ms")
  }

  def testParallelWordCount(): Unit = {
    val file = List("warn 2013 msg", "warn 2012 msg",
      "error 2013 msg", "warn 2013 msg")

    def wordcount(str: String): Int = str.split(" ").count("msg" == _)

    val num = file.par.map(wordcount).par.reduceLeft(_ + _)

    println("wordcount:" + num)
  }

}
