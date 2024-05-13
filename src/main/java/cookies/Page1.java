package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CPage1")
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

				Cookie ck = new Cookie("emailid", mailid);// creating cookie object
				response.addCookie(ck);// adding cookie in the response

				out.println("<a href='CPage2'>Next Page</a>");

			} else if (mailid.equals("user@gmail.com") && password.equals("user123")) {
				out.println("Page 1");

				out.println("Welcome " + " " + mailid);

				Cookie ck = new Cookie("uname", mailid);// creating cookie object
				response.addCookie(ck);// adding cookie in the response

				out.println("<a href='CPage2'>Next Page</a>");
			}
		}

	}

}
