package br.com.gatto.ocejwcd.chapter4;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class C04E13 implements ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent scae) {

	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent scae) { // throws ServletException {
		ServletContext context = scae.getServletContext();
		if (scae.getName().equals("important")) {
			context.setAttribute(scae.getName(), scae.getValue());
		}
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent scae) {

	}

}
