import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ConfigServlet extends HttpServlet {

    ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String username = config.getInitParameter("username");
        String password = config.getInitParameter("password");

        out.println("<h2>ServletConfig Init Parameters</h2>");
        out.println("Username: " + username + "<br>");
        out.println("Password: " + password);
    }
}
