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
    testParallelWordCount()
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

    val fromURL = actor(new Act {
      become {
        case url: String => sender ! scala.io.Source.fromURL(url)
          .getLines().mkString("\n")
      }
    })

    val version = fromURL.ask(versionUrl)(akka.util.Timeout(5, TimeUnit.SECONDS))
    version.foreach(println _)

    println("=================================")

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

    val version = fromURL.ask(versionUrl)(akka.util.Timeout(5 , TimeUnit.SECONDS))
    version onComplete {
      case msg => println(msg); system.shutdown
    }

    println("=================================")
  }

  def testParallelProcessCollection(): Unit ={

    val urls = List("http://scala-lang.org",
      "https://github.com/SidneyXu")

    def fromURL(url: String) = scala.io.Source.fromURL(url)
      .getLines().mkString("\n")

    val t = System.currentTimeMillis()
    urls.map(fromURL(_))
//    urls.par.map(fromURL(_))
    println("time: " + (System.currentTimeMillis - t) + "ms")
  }

  def testParallelWordCount(): Unit ={
    val file = List("warn 2013 msg", "warn 2012 msg",
      "error 2013 msg", "warn 2013 msg")

    def wordcount(str: String): Int = str.split(" ").count("msg" == _)

    val num = file.par.map(wordcount).par.reduceLeft(_ + _)

    println("wordcount:" + num)
  }

}
