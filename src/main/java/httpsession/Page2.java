package httpsession;

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

@WebServlet("/SPage2")
public class Page2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try (PrintWriter out = response.getWriter()) {

			response.setContentType("text/html");

			HttpSession session = request.getSession(false);

			String mailid = (String) session.getAttribute("mail");

			out.println("Page 2");

			out.println("Welcome" + " " + mailid);

			out.print("<a href='SPage3'>Next Page</a>");
		}

	}

}
