package session;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ValidateServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String name = request.getParameter("user");
		String pass = request.getParameter("pwd");

		if (pass.equals("1234")) {
			HttpSession session = request.getSession();
			session.setAttribute("user", name);
			response.sendRedirect("WelcomeServlet");
		}
	}
}
