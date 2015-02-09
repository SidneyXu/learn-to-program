/**
 * Created by mrseasons on 2/9/15.
 */

//while
var x = 5;
while (x < 10) {
  x += 1
}

//for
for (i <- 1 to 5)
  print(i) //12345
println()

for (i <- 1 until 5)
  print(i) //1234
println()

var sum = ""
for (ch <- "Hello")
  sum += ch
println(sum)  //Hello