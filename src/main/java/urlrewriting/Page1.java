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

@WebServlet("/UPage1")
public class Page1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try (PrintWriter out = response.getWriter()) {

			response.setContentType("text/html");

			String mailid = request.getParameter("email");
			String password = request.getParameter("pwd");

			if (mailid.equals("admin@gmail.com") && password.equals("admin123")) {

				out.println("Page 1");

				out.println("Welcome " + " " + mailid);
				
				out.print("<a href='UPage2'>Next Page 1</a>");

				out.print("<a href='UPage2?mail=" + mailid + "'>Next Page 2</a>");

			} else if (mailid.equals("user@gmail.com") && password.equals("user123")) {
				out.println("Page 1");

				out.println("Welcome " + " " + mailid);

				out.print("<a href='UPage2?mail=" + mailid + "'>Next Page</a>");

			}
		}

	}

}
