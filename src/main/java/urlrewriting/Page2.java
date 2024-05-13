package urlrewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UPage2")
public class Page2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try (PrintWriter out = response.getWriter()) {

			response.setContentType("text/html");

			String mailid = request.getParameter("mail");

			out.println("Page 2");

			out.println("Welcome" + " " + mailid);
			
			out.print("<a href='UPage3?mail=" + mailid + "'>Next Page</a>");
		}

	}

}
