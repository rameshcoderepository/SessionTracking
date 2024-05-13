package project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/validation")
public class validation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try (PrintWriter out = response.getWriter()) {

			response.setContentType("text/html");

			String mailid = request.getParameter("email");
			String password = request.getParameter("pwd");

			if (mailid.equals("admin@gmail.com") && password.equals("admin123")) {

				out.println("Welcome " + " " + mailid);

//				HttpSession session = request.getSession(true);
//				session.setAttribute("mailid", mailid);

				RequestDispatcher requestDispatcher = request.getRequestDispatcher("AdminHome.jsp");
				requestDispatcher.forward(request, response);

			} else if (mailid.equals("user@gmail.com") && password.equals("user123")) {

				out.println("Welcome " + " " + mailid);

//				HttpSession session = request.getSession();
//				session.setAttribute("mailid", mailid);

				RequestDispatcher requestDispatcher = request.getRequestDispatcher("UserHome.jsp");
				requestDispatcher.forward(request, response);

			}
		}

	}

}
