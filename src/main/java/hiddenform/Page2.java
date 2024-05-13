package hiddenform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HPage2")
public class Page2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try (PrintWriter out = response.getWriter()) {

			response.setContentType("text/html");

			String mailid = request.getParameter("mail");

			out.println("Page 2");

			out.println("Welcome" + " " + mailid);

			out.print("<form action='HPage3'>");
			out.print("<input type='hidden' name='mail' value='" + mailid + "'>");
			out.print("<input type='submit' value='nextpage'>");
			out.print("</form>");

		}

	}

}
