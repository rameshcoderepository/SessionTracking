package withouts.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Page1")
public class Page1 extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try (PrintWriter out = response.getWriter()) {

			response.setContentType("text/html");

			String username = request.getParameter("email");
			String password = request.getParameter("pwd");

			if (username.equals("admin@gmail.com") && password.equals("admin123")) {

				out.println("Page 1");

				out.println("Welcome " + " " + username);

				RequestDispatcher requestDispatcher = request.getRequestDispatcher("Page2"); ////
				requestDispatcher.forward(request, response);

				out.println("<a href='Page2'>Next Page</a>");

			} else if (username.equals("user@gmail.com") && password.equals("user123")) {
				out.println("Page 1");

				out.println("Welcome " + " " + username);

//				RequestDispatcher requestDispatcher = request.getRequestDispatcher("UserHome.jsp");
//				requestDispatcher.forward(request, response);

				out.println("<a href='Page2'>Next Page</a>");
			}
		}

	}

}
