import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class HttpServletDemo extends HttpServlet {


protected void doGet(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException {


res.setContentType("text/html");
PrintWriter out = res.getWriter();
out.println("<h2>GET Request Handled</h2>");
}


protected void doPost(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException {


res.setContentType("text/html");
PrintWriter out = res.getWriter();
out.println("<h2>POST Request Handled</h2>");
}
}