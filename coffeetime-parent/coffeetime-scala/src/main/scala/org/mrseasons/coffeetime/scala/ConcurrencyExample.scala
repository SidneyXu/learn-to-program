package org.mrseasons.coffeetime.scala

import scala.concurrent.{ExecutionContext, Promise, Future, SyncVar}
import ExecutionContext.Implicits.global

/**
 * Created by mrseasons on 4/15/15.
 */
object ConcurrencyExample {

  def main(args: Array[String]) {
    //future
    val s = "Hello"
    val ff: Future[String] = Future {
      s + " future!"
    }
    ff onSuccess {
      case msg => println(msg)
    }


    //syncvar
    val v=new SyncVar[Int]
    v.put(1)
    var result=v.get
    println(result)
    result=v.take()
    println(result)
    result=v.get
    println(result)

    //promise
//    val p = Promise[Int]
//    val f = p.future
//    val producer = Future {
//      val r = produceSomething()
//      p success r
//      continueDoingSomethingUnrelated()
//    }
//    val consumer = Future {
//      startDoingSomething()
//      f onSuccess {
//        case r => doSomethingWithResult()
//      }
//    }
//
//    p completeWith(f)
//    p.future.onSuccess{
//      case x => println(x)
//    }
  }
}
