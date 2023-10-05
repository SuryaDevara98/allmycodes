package com.te.myconfiguration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AnnotationBasedXml extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { AnnotationBasedDispatcherServlet.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
