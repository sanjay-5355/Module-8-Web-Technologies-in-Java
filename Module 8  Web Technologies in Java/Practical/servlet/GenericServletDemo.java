import java.io.*;
import javax.servlet.*;


public class GenericServletDemo extends GenericServlet {


public void service(ServletRequest req, ServletResponse res)
throws ServletException, IOException {


res.setContentType("text/html");
PrintWriter out = res.getWriter();
out.println("<h2>This is GenericServlet</h2>");
}
}