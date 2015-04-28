import java.util
import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.JavaConversions.mapAsJavaMap

/**
 * Created by mrseasons on 2015/2/12.
 */

//---create map---
//immutable map
val scores = Map("Alice" -> 10, "Bob" -> 3)
println(scores) //Map(Alice -> 10, Bob -> 3)

//mutable map
val scores2 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3)

//other format
val scores3 = Map(("Alice", 10), ("Bob", 3))


//---access elements---
//exist key
var bobScore = scores("Bob")
println(bobScore) //3

//not exist key
//var tinaScore = scores("Tina")  key not found: Tina
var aliceScore = if (scores.contains("Alice")) scores("Alice") else 0
var janeScore = scores.getOrElse("Jane", 0)
println(aliceScore) //10
println(janeScore) //0


//---update elements----
//--mutable map--
//insert an element
scores2("Becky") = 12

//insert several elements
scores2 +=("Jane" -> 5, "Peter" -> 11)
println(scores2) //Map(Bob -> 20, Peter -> 11, Jane -> 5, Alice -> 10, Becky -> 12)

//delete elements
scores2 -= "Alice"
println(scores2) //Map(Bob -> 20, Peter -> 11, Jane -> 5, Becky -> 12)


//--immutable map--
var newScores = scores + ("Jane" -> 7) - "Bob"
println(newScores) //Map(Alice -> 10, Jane -> 7)


//---iterator---
for ((k, v) <- newScores) {
  println(k, v) //(Alice,10)(Jane,7)
}
val keys = newScores.keySet
val values = newScores.values
for (k <- keys) {
  println(k) //Alice Jane
}



//---invert map---
val inverseScore = for ((k, v) <- newScores) yield (v, k)
println(inverseScore) //Map(10 -> Alice, 7 -> Jane)


//---sorted map---
val treeSortedScores = scala.collection.immutable.SortedMap("Alice" -> 10, "Fred" -> 7, "Bob" -> 3)
println(treeSortedScores) //Map(Alice -> 10, Bob -> 3, Fred -> 7)


val sortedScores = scala.collection.mutable.LinkedHashMap("Alice" -> 10, "Fred" -> 7, "Bob" -> 3)
println(sortedScores) //Map(Alice -> 10, Fred -> 7, Bob -> 3)


//---with java map---
//--Java Map -> Scala Map--
val javaMap = new util.HashMap[String, Integer]()
javaMap.put("Jane", 10)
javaMap.put("Tina", 20)
val scalaMap: scala.collection.mutable.Map[String, Integer] = javaMap
println(scalaMap) //Map(Jane -> 10, Tina -> 20)

//--Scala Map -> Java Map--
val javaMapAgain = new util.HashMap[String, Integer](scalaMap)
javaMapAgain.put("Linda", 30)
println(javaMapAgain) //{Jane=10, Linda=30, Tina=20}


