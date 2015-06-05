/**
 * Created by mrseasons on 2015/2/9.
 */
//  if
//  Traditional usage
var max = 1
if (1 < 2)
  max = 2

//  last expression as value of a block
max = if (1 < 2) {
  println("a")
  2
} else {
  println("b")
  1
}

//  As expression
var x = -1
val s = if (x > 0) 1 else -1
val s2 = if (x > 0) "a" else 65
val s3 = if (x > 0) 1 else ()

println(s) //-1
println(s2) //65
println(s3) //()

println(s.getClass)
println(s2.getClass)
println(s3.getClass)