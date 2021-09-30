package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ValidateServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		PrintWriter pwriter = response.getWriter();

		String name = request.getParameter("user");
		String password = request.getParameter("pwd");
		pwriter.println("Hello " + name);
		pwriter.println("Your Password is: " + password);

		Cookie c1 = new Cookie("Name", name);
		Cookie c2 = new Cookie("Password", password);

		response.addCookie(c1);
		response.addCookie(c2);
		pwriter.println("<br><a href='Welcome'> View Details</a>");
	}
}
