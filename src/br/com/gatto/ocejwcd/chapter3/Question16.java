package br.com.gatto.ocejwcd.chapter3;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Question16 extends HttpServlet {

	private static final long serialVersionUID = 4751060698093800026L;

	@Override
	public void init() throws ServletException {
		log("In init");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
		// The checked IOException thrown by getWriter() and write() was not
		// declared.
		// Writer out = resp.getWriter();
		// out.write("In get method");
	}
}
