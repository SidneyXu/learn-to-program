import java.io.IOException

/**
 * Created by mrseasons on 2/11/15.
 */

try {
  throw new IOException()
} catch {
  //not care exception
  case _: IOException => println("io exception")
  //care exception
  case e: Exception => e.printStackTrace();
} finally {
}