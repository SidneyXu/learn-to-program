import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

/**
 * Created by mrseasons on 2/11/15.
 */

//---fixed length array---
val a = new Array[Int](10)
val s = Array("Hello", "World")

//access elements
println(s(0)) //Hello

//---variable length array(ArrayBuffer)---
val b = ArrayBuffer[Int]()
val c = new ArrayBuffer[Int]

//modify
b += 1
b +=(2, 3, 4)
b.trimEnd(2) //efficient method
b ++= Array(4, 5, 6)
println(b) //ArrayBuffer(1, 2, 4, 5, 6)

//inefficient methods
b.insert(2, 6)
b.insert(2, 6, 7, 8)
b.remove(3)
b.remove(3, 4)

//---conversion between arrays and buffers----
val ab = a.toBuffer
val ba = b.toArray

//---iterator---
c +=(1, 2, 3, 4)
for (i <- 0 until c.length) {
  print(c(i)) //1234
}
println()

for (ele <- c) {
  print(ele) //1234
}
println()

//specify steps
for (i <- Range(0, c.length, 2)) {
  print(c(i)) //13
}
println()

//reverse
for (i <- 0 until c.length reverse) {
  print(c(i)) //4321
}
println()

//---create new array---
//yield
val result = for (ele <- c) yield {
  ele * 2
}
println(result) //ArrayBuffer(2, 4, 6, 8)

//filter
var filter = c.filter(_ % 2 == 0)
println(filter) //ArrayBuffer(2, 4)

filter = c.filter(_ % 2 == 0).map(2 * _)
println(filter) //ArrayBuffer(4, 8)

filter = c.filter {
  _ % 2 == 0
}.map {
  2 * _
}
println(filter) //ArrayBuffer(4, 8)


//---common methods---
var arr = Array(1, 3, 2, 2)
assert(8 == arr.sum)
assert(3 == arr.max)
assert(1 == arr.min)

//not affect original array
println(arr.sorted.toList) //List(1, 2, 2, 3)
println(arr.sortWith(_ < _).toList) //List(1, 2, 2, 3)
println(Array("abc", "cb", "defg").sortBy(_.size).toList) //List(cb, abc, defg)
println(arr.distinct.toList) //List(1, 3, 2)

println(arr.mkString("-")) //1-3-2-2
println(arr.mkString("<", ",", ">")) //<1,3,2,2>

//affect original array
println(arr.toList) //List(1, 3, 2, 2)
Sorting.quickSort(arr)
println(arr.toList) //List(1, 2, 2, 3)

//---Multidimensional array---
val mula = Array.ofDim[Double](3, 4)
val mulb = new Array[Array[Int]](10)