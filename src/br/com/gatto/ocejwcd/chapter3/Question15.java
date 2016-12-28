package br.com.gatto.ocejwcd.chapter3;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Question15 extends HttpServlet {

	private static final long serialVersionUID = 5205726714586478144L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		Writer out = resp.getWriter();
		out.write("In service method");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		Writer out = resp.getWriter();
		out.write("In get method");
	}
}
