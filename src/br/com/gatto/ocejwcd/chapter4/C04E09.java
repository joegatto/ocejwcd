package br.com.gatto.ocejwcd.chapter4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class C04E09 extends HttpServlet {
	private static final long serialVersionUID = 2475525658400232029L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String title = getServletConfig().getInitParameter("apptitle");
		resp.getWriter().write(title);
	}
}
