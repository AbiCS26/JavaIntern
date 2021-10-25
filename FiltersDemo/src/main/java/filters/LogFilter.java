package filters;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class LogFilter implements Filter {

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		Logger logger = Logger.getLogger("MyLog");
		FileHandler fh;

		fh = new FileHandler("D:/New folder/AdminLog.txt");
		logger.addHandler(fh);
		SimpleFormatter formatter = new SimpleFormatter();
		fh.setFormatter(formatter);

		String name = req.getParameter("name");
		String addr = req.getRemoteAddr();

		logger.info(name);
		logger.info(addr);
		chain.doFilter(req, res);
	}

}
