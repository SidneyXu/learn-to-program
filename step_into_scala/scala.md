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

## 鸭子类型

使用类似
```scala
{ def close(): Unit }
```
作为参数类型定义。从而任何含有 close()函数的类都能作为参数传递，避免了继承的不够灵活的特性。

```scala
def withClose(closeAble: { def close(): Unit }, 
    op: { def close(): Unit } => Unit) {
    try {
        op(closeAble)
    } finally {
        closeAble.close()
    }
}

class Connection {
    def close() = println("close Connection")
}

val conn: Connection = new Connection()
withClose(conn, conn =>
    println("do something with Connection"))
```

## Currying

def add(x:Int, y:Int) = x + y
是普通的函数

def add(x:Int) = (y:Int) => x + y
是柯里化后的函数，相当于返回一个匿名函数表达式。

 def add(x:Int)(y:Int) = x + y
是简化写法

```scala
def withClose(closeAble: { def close(): Unit })
    (op: { def close(): Unit } => Unit) {
    try {
        op(closeAble)
    } finally {
        closeAble.close()
    }
}

class Connection {
    def close() = println("close Connection")
}

val conn: Connection = new Connection()
withClose(conn)(conn =>
    println("do something with Connection"))
```

## 泛型

"123456"
修改为

123456
虽然msg由String类型变为Int类型，但是由于使用了泛型，代码依旧可以正常运行。

```scala
def withClose[A <: { def close(): Unit }, B](closeAble: A)
  (f: A => B): B =
  try {
    f(closeAble)
  } finally {
    closeAble.close()
  }
class Connection {
  def close() = println("close Connection")
}
val conn: Connection = new Connection()
val msg = withClose(conn) { conn =>
  {
    println("do something with Connection")
    "123456"
  }
}

println(msg)

```

Traits



http://twitter.github.io/scala_school/zh_cn/basics.html
http://zh.scala-tour.com/#/duck-type
