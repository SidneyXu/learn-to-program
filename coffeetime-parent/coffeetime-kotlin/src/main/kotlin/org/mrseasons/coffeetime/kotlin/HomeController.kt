package org.mrseasons.coffeetime.kotlin;

import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Created by mrseasons on 2015/08/03.
 */
@WebServlet(name = "Hello", value = "/hello")
public class HomeController : HttpServlet() {
    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        resp?.writer?.write("Hello, World!")
    }
}