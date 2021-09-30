package filters;

import java.io.IOException;
import java.util.Date;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

public class LogFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;

		String servletPath = req.getServletPath();
		String remoteAddr = request.getRemoteAddr();
		String name = req.getParameter("name");
		System.out.println(" ");
		System.out.println("Logging Date: " + new Date());
		System.out.println("Name: " + name);
		System.out.println("Servlet path: " + servletPath);
		System.out.println("Call from : " + remoteAddr);

		chain.doFilter(request, response);

	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
