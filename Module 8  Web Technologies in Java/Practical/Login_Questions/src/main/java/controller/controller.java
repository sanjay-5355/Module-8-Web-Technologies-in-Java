package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class controller
 */
@WebServlet("/Controller")
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");

		if (action.equalsIgnoreCase("Login")) {

			String email = "user@gmail.com";
			String pass = "123";

			if (request.getParameter("email").equalsIgnoreCase(email)
					&& request.getParameter("password").equalsIgnoreCase(pass)) {

				HttpSession session = request.getSession();
				session.setAttribute("email", email);

				Cookie ck = new Cookie("email", email);
				ck.setMaxAge(60 * 60); // 1 hour
				response.addCookie(ck);

				request.getRequestDispatcher("home.jsp").forward(request, response);
			} else {

				request.setAttribute("msg", "E mail or password is incorrect");
			}
		}
	}

}
