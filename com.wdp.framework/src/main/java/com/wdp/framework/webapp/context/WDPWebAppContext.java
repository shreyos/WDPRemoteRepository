/**
 * 
 */
package com.wdp.framework.webapp.context;

import javax.servlet.ServletContext;

/**
 * @author Shreyos
 *
 */
public class WDPWebAppContext {
	
	private static String webAppName = "";

	public WDPWebAppContext(ServletContext context){
		
		setWebAppName(context.getInitParameter("webappName"));
		
		System.out.println("WDPWebAppContext() - WebAppName = '" + getWebAppName() + "'");
	}

	/**
	 * @return the webAppName
	 */
	public static String getWebAppName() {
		return webAppName;
	}

	/**
	 * @param webAppName the webAppName to set
	 */
	public static void setWebAppName(String webAppName) {
		WDPWebAppContext.webAppName = webAppName;
	}

	/** Cleaning up */
	public void destroy() {
		System.out.println("Destroying "+WDPWebAppContext.class.getName());
	}

	
}
