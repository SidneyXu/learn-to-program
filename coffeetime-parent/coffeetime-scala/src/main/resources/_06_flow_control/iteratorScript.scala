/**
 * Created by mrseasons on 2015/3/26.
 */

//Iterator
val it: Iterator[Int] = Iterator.range(1, 5)
while (it.hasNext) {
  val v = it.next()
  println("it", v) //1,2,3,4
}


//map
val it2 = Iterator.range(1, 5).map(i => i + 5)
while (it2.hasNext) {
  val v = it2.next()
  println("it2", v) //6,7,8,9
}

//flat map
val it3 = Iterator.range(1, 5).flatMap(i => Iterator.range(i, i + 2))
while (it3.hasNext) {
  val v = it3.next()
  println("it3", v) //1,2|2,3|3,4|4,5
}

//for each
Iterator.range(1, 5).foreach(i => println("it4", i)) //1,2,3,4


//filter
val it5 = Iterator.range(1, 5).filter(i => i % 2 == 0)
while (it5.hasNext) {
  val v = it5.next()
  println("it5", v) //2,4
}

//zip
var it6 = Iterator.range(1, 5).zip(Iterator.range(10, 20))
while (it6.hasNext) {
  val v = it6.next()
  println("it6", v) //(1,10),(2,11),(3,12),(4,13)
}
it6 = Iterator.range(1, 5).zip(Iterator.range(10, 12))
while (it6.hasNext) {
  val v = it6.next()
  println("it6", v) //(1,10),(2,11)
}