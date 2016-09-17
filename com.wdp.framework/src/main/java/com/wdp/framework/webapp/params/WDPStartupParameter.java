package com.wdp.framework.webapp.params;

/**
 * @author Shreyos
 *
 */
public class WDPStartupParameter {

	/**
	 * @param startupError the startupError to set
	 */
	public static void setStartupError(String startupError) {
		System.out.println("WDPStartupParameter error occurs during startup = "+startupError);
	}


	/**
	 * @param startupStatus the startupStatus to set
	 */
	public static void setStartupStatus(String startupStatus) {
		System.out.println("WDPStartupParameter startup status = "+startupStatus);
	}
	
	/**
	 * @param startupStatus the startupStatus to set
	 */
	public static void setStatusDestroy(String listner) {
		System.out.println("WDPStartupParameter destroying = "+listner);
	}

	/** Cleaning up */
	public static void destroy() {
		System.out.println("Destroying "+WDPStartupParameter.class.getName());
	}
}
