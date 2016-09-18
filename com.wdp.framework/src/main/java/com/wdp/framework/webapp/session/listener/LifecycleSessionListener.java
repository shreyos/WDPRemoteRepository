package com.wdp.framework.webapp.session.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.wdp.core.context.SharedData;
import com.wdp.core.profile.BaseProfile;
import com.wdp.core.profile.impl.BaseProfileImpl;

public class LifecycleSessionListener implements HttpSessionListener {

	private static int totalActiveSessions;
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSessionListener#sessionCreated(javax.servlet.http.HttpSessionEvent)
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public void sessionCreated(HttpSessionEvent httpSessionEvent) {
		
		totalActiveSessions++;
		
		System.out.println("LifecycleSessionListener session created, total number of active sesssions in web container  = "+totalActiveSessions);
		System.out.println("Creating SharedData");
		
		HttpSession session = httpSessionEvent.getSession();
		SharedData sharedData = new SharedData();
		session.setAttribute(SharedData.SHARED_DATA, sharedData);
		
		System.out.println("Creating Baseprofile");
		BaseProfile baseProfile = new BaseProfileImpl();
		session.setAttribute(BaseProfile.BASE_PROFILE, baseProfile);
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSessionListener#sessionDestroyed(javax.servlet.http.HttpSessionEvent)
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
		
		totalActiveSessions--;
		
		HttpSession session = httpSessionEvent.getSession();
		SharedData sharedData = (SharedData) session.getAttribute(SharedData.SHARED_DATA);
		
		if(null != sharedData){
			sharedData.clear();
		}
		session.removeAttribute(SharedData.SHARED_DATA);
		
		BaseProfile baseProfile = (BaseProfile) session.getAttribute(BaseProfile.BASE_PROFILE);
		if(null != baseProfile){
			baseProfile.removeAllProperties();
			baseProfile = null;
		}
		session.removeAttribute(BaseProfile.BASE_PROFILE);
		
		System.out.println("LifecycleSessionListener session destroyed, total number of active sesssions in container  = "+totalActiveSessions);
	}

}
