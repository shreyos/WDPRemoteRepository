package com.wdp.framework.webapp.startup.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.wdp.framework.webapp.context.WDPServletContext;
import com.wdp.framework.webapp.context.WDPWebAppContext;
import com.wdp.framework.webapp.params.WDPStartupParameter;

/**
 * This listener will execute first among all listeners during server start up.
 * @author Shreyos
 * @version
 * @since
 */
public class WDPFirstStartupListener implements ServletContextListener {

	WDPWebAppContext webAppContext = null;

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	/**
	 * Notification that the web application is ready to process requests.
	 */
	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		System.out.println("WDPFirstStartupListener context initializing.");
		
		ServletContext context = null;
		
		try {
			context = servletContextEvent.getServletContext();
			WDPServletContext.setServletContext(context);
			webAppContext = new WDPWebAppContext(context);
			System.out.println("WDPFirstStartupListener context initialized successfully .");
		} catch (Exception e) {
			System.out.println("WDPFirstStartupListener startup failure .");
			context.setAttribute("startupError", e.getMessage());
		}
		
	}
	
	
	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	/**
	 * Notification that the servlet context is about to be shut down.
	 */
	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		
		System.out.println("WDPFirstStartupListener context destroying .");
		
		WDPStartupParameter.setStatusDestroy(this.getClass().getName());
		webAppContext.destroy();
		WDPStartupParameter.destroy();
		WDPServletContext.setServletContext(null);
		
		System.out.println("WDPFirstStartupListener context destroyed successfully.");
	}


}
