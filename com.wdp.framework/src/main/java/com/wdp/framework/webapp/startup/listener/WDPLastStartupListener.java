package com.wdp.framework.webapp.startup.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.wdp.framework.webapp.params.WDPStartupParameter;

/**
 * This listener will execute last among all listeners during server start up.
 * @author Shreyos
 * @version
 * @since
 */
public class WDPLastStartupListener implements ServletContextListener {


	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	/**
	 * Notification that the web application is ready to process requests.
	 */
	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		System.out.println("WDPLastStartupListener context initializing.");
		
		ServletContext context = null;
		
		context = servletContextEvent.getServletContext();
		if(null == context.getAttribute("startupError")){
			WDPStartupParameter.setStartupStatus("successful");
		}else{
			WDPStartupParameter.setStartupStatus("failure");
			WDPStartupParameter.setStartupError((String) context.getAttribute("startupError"));
		}
		
		System.out.println("WDPLastStartupListener context initialized successfully .");
	}
	
	
	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	/**
	 * Notification that the servlet context is about to be shut down.
	 */
	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		
		System.out.println("WDPLastStartupListener context destroying .");

		WDPStartupParameter.setStatusDestroy(this.getClass().getName());
		
		System.out.println("WDPLastStartupListener context destroyed successfully.");
	}


}
