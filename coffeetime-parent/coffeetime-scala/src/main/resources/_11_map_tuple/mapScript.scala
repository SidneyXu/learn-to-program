import java.util
import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.JavaConversions.mapAsJavaMap

/**
 * Created by mrseasons on 2/12/15.
 */

//---create map---
//immutable map
val scores = Map("Alice" -> 10, "Bob" -> 3)

//mutable map
val scores2 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3)

//other format
val scores3 = Map(("Alice", 10), ("Bob", 3))
val keys = newScores.keySet
val values = newScores.values
//---invert map---
val inverseScore = for ((k, v) <- newScores) yield (v, k)

println(bobScore) //3
println(aliceScore) //10
println(janeScore) //0

//---update elements----
//mutable map
scores2("Bob") = 20
//insert new element
scores2("Becky") = 12
//add several elements
scores2 +=("Jane" -> 5, "Peter" -> 11)
println(scores2) //Map(Bob -> 20, Peter -> 11, Jane -> 5, Alice -> 10, Becky -> 12)
//delete elements
scores2 -= "Alice"
println(scores2) //Map(Bob -> 20, Peter -> 11, Jane -> 5, Becky -> 12)
//---sorted map---
val treeSortedScores = scala.collection.immutable.SortedMap("Alice" -> 10, "Fred" -> 7, "Bob" -> 3)
println(scores) //Map(Alice -> 10, Bob -> 3)
println(newScores) //Map(Alice -> 10, Jane -> 7)

//---iterator---
for ((k, v) <- newScores) {
  println(k, v) //(Alice,10)(Jane,7)
}
val sortedScores = scala.collection.mutable.LinkedHashMap("Alice" -> 10, "Fred" -> 7, "Bob" -> 3)
//---with java map---
val javaMap = new util.HashMap[String, Integer]()
for (k <- keys) {
  println(k) //Alice Jane
}
val scalaMap: scala.collection.mutable.Map[String, Integer] = javaMap
println(inverseScore) //Map(10 -> Alice, 7 -> Jane)
val javaMapAgain = new util.HashMap[String, Integer](scalaMap)
println(treeSortedScores) //Map(Alice -> 10, Bob -> 3, Fred -> 7)
//---access elements---
var bobScore = scores("Bob")
println(sortedScores) //Map(Alice -> 10, Fred -> 7, Bob -> 3)
//var tinaScore = scores("Tina")  key not found: Tina
var aliceScore = if (scores.contains("Alice")) scores("Alice") else 0
javaMap.put("Jane", 10)
javaMap.put("Tina", 20)
var janeScore = scores.getOrElse("Jane", 0)
println(scalaMap) //Map(Jane -> 10, Tina -> 20)
//immutable map
var newScores = scores + ("Jane" -> 7) - "Bob"
javaMapAgain.put("Linda", 30)
println(javaMapAgain) //{Jane=10, Linda=30, Tina=20}








