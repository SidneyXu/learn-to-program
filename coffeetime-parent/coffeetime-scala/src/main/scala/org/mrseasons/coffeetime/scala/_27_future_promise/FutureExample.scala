package org.mrseasons.coffeetime.scala._27_future_promise

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._

/**
 * Created by mrseasons on 2015/05/25.
 */
object FutureExample extends App {

  def simpleFuture: Unit = {
    //---future---
    val s = "Hello"
    val f1: Future[String] = Future {
      s + " future!"
    }
    f1 onSuccess {
      case msg => println(msg, Thread.currentThread().getName)
    }
    f1 onComplete {
      case msg => println("onComplete")
    }
    println("---1---")
    //outputs:
    // onComplete
    // ---1---
    // (Hello future!,ForkJoinPool-1-worker-5)
  }

  def simplePromise: Unit = {
    //---promise---
    //p.success create a new future and call onSuccess
    //p.fail create a new future and call onFailure
    val f = Future {
      1
    }
    val p = Promise[Int]()
    p completeWith f
    //A promise p completes the future returned by p.future
    p.future onSuccess {
      case x => println(x, Thread.currentThread().getName)
    }
    println("---3---")
    //outputs:
    //  ---3---
    //  (1,ForkJoinPool-1-worker-5)
  }

  def futureAndPromise: Unit = {
    def heavyFuture = {
      val p = Promise[Int]()
      Future {
        Thread.sleep(1000)
        val result = 10
        p.success(result)
      }
      p.future
    }

    val f = heavyFuture
    f onSuccess { case x => println(x) } //10

    Thread.sleep(3000)
  }

  def simpleSyncVar: Unit = {
    //---syncvar---
    val v = new SyncVar[Int]
    v.put(1)
    var result = v.get
    println("result", result, Thread.currentThread().getName) //(result,1,main)

    result = v.take()
    println("take", result, Thread.currentThread().getName) //(take,1,main)

    //blocking...
    //result = v.get
    //println("get", result, Thread.currentThread().getName)
    println("---2---")
  }
}
