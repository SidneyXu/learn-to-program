/**
 * Created by mrseasons on 15-2-2.
 */
val x = 1
def y = 2

//error
//val a=10/0

//normal, only executed when used
//def b = 10 / 0


//just test
def loop: Int = loop * 1
def constOne(x: Int, y: => Int) = 1

//constOne(1, loop)
//constOne(loop, 2)


