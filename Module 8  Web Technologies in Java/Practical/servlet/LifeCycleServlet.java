import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class LifeCycleServlet extends HttpServlet {


public void init() {
System.out.println("init() called");
}


protected void doGet(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException {
res.getWriter().println("Service method executed");
}


public void destroy() {
System.out.println("destroy() called");
}
}