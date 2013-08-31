package com.btmatthews.mars.portal.webapp;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class PortalWebAppInitializer implements WebApplicationInitializer {

	private final static String PORTAL = "portal";

	public void onStartup(final ServletContext servletContext)
			throws ServletException {
		final AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();
		root.scan("com.btmatthews.mars.portal.config");

		servletContext.addListener(new ContextLoaderListener(root));

		ServletRegistration.Dynamic portalServlet = servletContext.addServlet(
				PORTAL, new DispatcherServlet(root));
		portalServlet.setLoadOnStartup(1);
		portalServlet.addMapping("/portal/*");
	}
}
