package crud;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ReadServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CRUDFiles cal = new CRUDFiles();
		PrintWriter out = response.getWriter();
		String s = cal.readFile();
		out.print("File contents : \n" + s);
	}
}