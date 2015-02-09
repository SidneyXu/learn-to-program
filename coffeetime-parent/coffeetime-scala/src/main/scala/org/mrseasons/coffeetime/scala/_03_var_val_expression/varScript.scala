import java.util.Date

/**
 * Created by mrseasons on 2/6/15.
 */
//definition
var name: String = "Jack"
val two: Int = 2

var lastName = "Peter"
val three = 3

//? loading mechanism
val words = ("a", "b", "c", new Date().getTime)
lazy val lazyWords = ("a", "b", "c", new Date().getTime)
def newWords = ("a", "b", "c", new Date().getTime)
Thread.sleep(3000)

println(words)
println(lazyWords)
println(newWords)

Thread.sleep(3000)

println(words)
println(lazyWords)
println(newWords)
