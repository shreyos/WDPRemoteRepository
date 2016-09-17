package com.wdp.framework.webapp.context;

import javax.servlet.ServletContext;

/**
 * @author Shreyos
 *
 */
public class WDPServletContext {

	protected static ServletContext servletContext = null;

	/**
	 * @return the servletContext
	 */
	public static ServletContext getServletContext() {
		return servletContext;
	}

	/**
	 * @param servletContext the servletContext to set
	 */
	public static void setServletContext(ServletContext servletContext) {
		System.out.println("Setting ServletContext in WDPServletContext.");
		WDPServletContext.servletContext = servletContext;
	}
}
