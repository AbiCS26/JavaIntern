package crud;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CRUDFiles cal = new CRUDFiles();
		PrintWriter out = response.getWriter();
		String s = request.getParameter("content");
		cal.updateFile(s);
		out.print("UPDATED SUCCESSFULLY");
	}
}