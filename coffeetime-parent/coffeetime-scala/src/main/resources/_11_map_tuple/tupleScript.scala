/**
 * Created by mrseasons on 2/12/15.
 */
val tuple = (1, 3.14, "Hello World")
println(tuple.getClass) //class scala.Tuple3

//index from 1 not 0
println(tuple._2) //3.14

val (first, second, third) = tuple
//omit the last value
val (one, two, _) = tuple

//zip
val symbols = Array("<", "-", ">")
val counts = Array(2, 10, 2)
val pairs = symbols.zip(counts)
println(pairs.getClass) //class [Lscala.Tuple2
for ((s, c) <- pairs) {
  println(s, c) //(<,2) (-,10) (>,2)
}
