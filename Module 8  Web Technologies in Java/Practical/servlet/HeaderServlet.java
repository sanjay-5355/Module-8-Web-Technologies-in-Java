import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;


public class HeaderServlet extends HttpServlet {


protected void doGet(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException {


res.setContentType("text/html");
res.setHeader("Custom-Header", "HeaderValue");


PrintWriter out = res.getWriter();
out.println("<h2>Request Headers</h2>");


Enumeration<String> headers = req.getHeaderNames();
while (headers.hasMoreElements()) {
String h = headers.nextElement();
out.println(h + " : " + req.getHeader(h) + "<br>");
}
}
}