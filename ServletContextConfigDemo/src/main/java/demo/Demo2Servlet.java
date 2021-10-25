package demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Demo2Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		PrintWriter out = response.getWriter();
		ServletConfig sc = getServletConfig();

		String user = sc.getInitParameter("user");
		out.println(user);
		out.println(sc.getServletName());
		String company = sc.getServletContext().getInitParameter("companyName");
		out.println(company);
	}
}
