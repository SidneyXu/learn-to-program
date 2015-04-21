import scala.annotation.tailrec

/**
 * Created by mrseasons on 2015/4/13.
 */
//recursion
def factorial(n: Int): Int = {
  if (n <= 1) 1
  else n * factorial(n - 1)
}
factorial(5)

//tail recursion
def factorialTail(n: Int): Int = {
  @tailrec
  def loop(acc: Int, n: Int): Int =
    if (n == 0) acc else loop(n * acc, n - 1)

  loop(1, n)
}
factorialTail(5)