# Core

## 常量与变量

- val 定义常量
- var 定义变量
- 推荐多用常量

## 函数

- 函数是一等公民
- 使用 def 来定义。
- 函数可以像值一样作为参数传递给另一参数。
- 默认总是返回函数最后一句语句计算的值
- 函数名可以是任意字符，包括'+,-,*,/'

实例

```scala
def square(a: Int) = a * a

def squareWithBlock(a: Int) = {
    a * a
}

val squareVal = (a: Int) => a * a

def addOne(f: Int => Int, arg: Int) = f(arg) + 1

println("square(2):" + square(2))
println("squareWithBlock(2):" + squareWithBlock(2))
println("squareVal(2):" + squareVal(2))
println("addOne(squareVal,2):" + addOne(squareVal, 2))
```

## 参数

按值传递

`def log(msg: String)`

调用时计算参数的值
log(1/0) 直接报错

按名称传递

`def log(msg: =>String)`

使用时计算参数的值
log(1/0) 不会报错，log 函数内部使用到时才会报错

## 类

使用 class 来定义类，new 来创建类

```scala
class Persion(val firstName: String, val lastName: String) {

    private var _age = 0
    def age = _age
    def age_=(newAge: Int) = _age = newAge

    def fullName() = firstName + " " + lastName

    override def toString() = fullName()
}

val obama: Persion = new Persion("Barack", "Obama")

println("Persion: " + obama)
println("firstName: " + obama.firstName)
println("lastName: " + obama.lastName)
obama.age_=(51)
println("age: " + obama.age)	//调用的是方法
```





http://zh.scala-tour.com/#/duck-type
