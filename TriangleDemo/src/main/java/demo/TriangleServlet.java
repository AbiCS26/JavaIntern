package demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TriangleServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int r = Integer.parseInt(req.getParameter("rows"));
		PrintWriter out = res.getWriter();
		out.println(getShape(r));
	}

	public String getShape(int x) {
		String s = "";
		for (int i = 1; i <= x; i++) {
			for (int j = i; j < x; j++) {
				s += " ";
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				s += "*";
			}
			s += "\n";
		}
		return s;
	}
}
