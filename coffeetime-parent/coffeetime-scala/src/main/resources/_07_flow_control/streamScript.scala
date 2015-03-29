/**
 * Created by mrseasons on 3/26/15.
 */

//stream
var r: Stream[Int] = Stream.range(1, 5)
println(r, r.getClass, r.head, r.tail) //(Stream(1, 2, ?),class scala.collection.immutable.Stream$Cons,1,Stream(2, ?))
r.foreach(i => println(i)) //1,2,3,4
//Stream.cons() is same as a::b
var nr = Stream.cons(30, Stream.range(1, 5))
r = range(1, 5)
println(r, r.getClass, r.head, r.tail) //(Stream(1, 2, ?),class scala.collection.immutable.Stream$Cons,1,Stream(2, ?))
r.foreach(i => println(i)) //1,2,3,4

//same as follow
def range(start: Int, end: Int): Stream[Int] = {
  if (start >= end) Stream.Empty
  else Stream.cons(start, range(start + 1, end))
}
println(nr, nr.getClass, nr.head, nr.tail) //(Stream(30, 1, ?),class scala.collection.immutable.Stream$Cons,30,Stream(1, ?))
nr.foreach(i => println(i)) //30,1,2,3,4
