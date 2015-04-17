/**
 * Created by mrseasons on 2015/4/17.
 */

val x = {
  var a = 1
  a += 3
}

val y = if (2 > 1) {
  1
} else {
  2
}

println(x, x.getClass) //(),void
println(y, y.getClass) //1,int

val a = 10
var b = 0
val c = b = a
println(a, b, c) //10,10,()