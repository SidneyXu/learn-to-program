/**
 * Created by mrseasons on 1/27/15.
 */

//---创建函数---
def addOne(m: Int): Int = m + 1
def addTwo(m: Int): Int = {
  m + 2
}

//---调用函数---
//省略()
def three = 1 + 2
println(three)
//println(three())  error

//无需参数
def four() = 1 + 3
println(four())
println(four)

//完整调用
println(addOne(3))


//---匿名函数---
var addThree = (x:Int)=>x+3
println(addThree(2))



