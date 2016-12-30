package br.com.gatto.ocejwcd.chapter4;

import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class C04E10 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		Writer out = resp.getWriter();
		Enumeration<String> e = null;
		// e = getServletConfig().getInitParameterNames(); - A
		// getInitParamNames(); - B
		e = getServletConfig().getInitParameterNames(); // - C
		e = getInitParameterNames(); // - D
		// e = getServletConfig().getInitParameterNames(); - E
		while (e.hasMoreElements()) {
			String name = (String) e.nextElement();
			String value = null;
			// value = getInitParam(name); - A
			// value = getServletConfig().getInitParameter(name); - B
			value = getInitParameter(name); // - C
			value = getServletConfig().getInitParameter(name); // - D
			// value = getServletContext().getInitParameter(name); - E
			out.write(value + "\n");
		}
	}
}
