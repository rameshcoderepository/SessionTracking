package withouts.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Page2")
public class Page2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try (PrintWriter out = response.getWriter()) {

			response.setContentType("text/html");

			String username = request.getParameter("email");
			String password = request.getParameter("pwd");

			out.println("Page 2");

			out.println("Welcome" + " " + username);

			out.println("<a href='Page3'>Next Page</a>");
		}

	}

}
