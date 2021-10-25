package demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		PrintWriter out = response.getWriter();
		ServletConfig sc = getServletConfig();
		String user = sc.getInitParameter("user");
		out.println(user);

		ServletContext sc2 = getServletContext();
		String company = sc2.getInitParameter("companyName");
		out.println(company);
	}
}
