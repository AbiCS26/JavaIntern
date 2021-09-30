package shapes;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SelectShapeServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		int s = 0, c = 0;
		try {
			s = Integer.parseInt(req.getParameter("shape"));
			try {
				int r = Integer.parseInt(req.getParameter("rows"));
				if (s == 5) {
					c = Integer.parseInt(req.getParameter("columns"));
				}
			} catch (NumberFormatException e) {
				out.println("ENTER NUMBER OF ROWS!");
			}
		} catch (NumberFormatException e) {
			out.println("SELECT ANY NUMBER BETWEEN 1-5!");
		}
		int r = Integer.parseInt(req.getParameter("rows"));
		if (s == 5) {
			c = Integer.parseInt(req.getParameter("columns"));
		}
		MainShape.mainShape(s, r, c, out);
	}

}
