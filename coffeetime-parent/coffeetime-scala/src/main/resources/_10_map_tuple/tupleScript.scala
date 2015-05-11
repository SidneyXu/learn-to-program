/**
 * Created by mrseasons on 2015/2/12.
 */
//create tuple
val tuple = (1, 3.14, "Hello World")
println(tuple.getClass) //class scala.Tuple3
//or
def divmod(x: Int, y: Int) = new Tuple2[Int, Int](x / y, x % y)

//index from 1 not 0
println(tuple._2) //3.14

val (first, second, third) = tuple
//omit the last value
val (one, two, _) = tuple

//in match pattern
divmod(7, 2) match {
  case (i, j) => println("match i,j")
}

//zip
val symbols = Array("<", "-", ">")
val counts = Array(2, 10, 2)
val pairs = symbols.zip(counts)
println(pairs.getClass) //class [Lscala.Tuple2
for ((s, c) <- pairs) {
  println(s, c) //(<,2) (-,10) (>,2)
}

