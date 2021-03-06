/**
 * Created by mrseasons on 2015/2/9.
 */
//while
var x = 5;
var sum = ""
while (x < 10) {
  x += 1
}


//for
for (i <- 1 to 5)
  print(i) //12345
println()

//until
for (i <- 1 until 5)
  print(i) //1234
println()

for (ch <- "Hello")
  sum += ch
println(sum)

//Hello

//use in list
class Person(val name: String, val age: Int) {
}

val persons = List(new Person(name = "Jane", age = 18), new Person(name = "Peter", age = 20),
  new Person(name = "Anna", age = 15), new Person(name = "Andy", age = 22))

val ages = for (p <- persons if p.age > 20) yield p.age
//sentence above is translated to below
val newAges = persons filter (p => p.age > 20) map (p => p.age)
println(ages) //List(22)
println(newAges) //List(22)


//advanced for
//creator
for (i <- 1 to 3; j <- 3 to 5) {
  println(i, j) //(1,3)(1,4)(1,5)(2,3)(2,4)(2,5)(3,3)(3,4)(3,5)
}
println()

//guard
for (i <- 1 to 3; j <- 3 to 5 if i == j) {
  println(i, j) //(3,3)
}
println()

//define other variables
for (i <- 1 to 3; from = 4 - i; j <- from to 3) {
  println(i, j, from) //(1,3,3)(2,2,2)(2,3,2)(3,1,1)(3,2,1)(3,3,1)
}
println()



//yield
var result = for (i <- 1 to 10) yield {
  i % 3
}
println(result) //Vector(1, 2, 0, 1, 2, 0, 1, 2, 0, 1)


//map
println(persons.map(p => p.age)) //List(18, 20, 15, 22)

//flatMap
println(persons.flatMap(p => List(p.age)).foreach(p => println("flatMap", p))) //(flatMap,18)(flatMap,20)(flatMap,15)(flatMap,22)

//filter
println(persons.filter(p => {
  if (p.age > 20) true else false
}).foreach(p => println("filter", p.age))) //(filter,22)

