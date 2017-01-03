package br.com.gatto.ocejwcd.chapter4;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class C04E15 extends GenericServlet {

	private static final long serialVersionUID = -3141990743274326458L;

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		ServletContext context = getServletContext();
		Integer counter = (Integer) context.getAttribute("hitcounter");
		if (counter == null) {
			counter = new Integer(1);
		} else {
			counter = new Integer(counter.intValue() + 1);
		}
		context.setAttribute("hitcounter", counter);

		Writer out = resp.getWriter();
		out.write("Visitor number: " + counter);
	}

}
