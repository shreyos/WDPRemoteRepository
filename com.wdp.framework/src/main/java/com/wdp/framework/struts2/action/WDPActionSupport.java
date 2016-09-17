package com.wdp.framework.struts2.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wdp.core.context.SharedData;

/**
 * @author Shreyos
 *
 */
@SuppressWarnings("rawtypes")
public abstract class WDPActionSupport extends ActionSupport implements SessionAware, ServletRequestAware, ServletResponseAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5109396851357075559L;
	
	
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected Map session;
	
	
	/**
	 * @return
	 * @throws Exception
	 */
	public abstract String executeAction() throws Exception;
	
    /**
	 * @return the request
	 */
	public HttpServletRequest getRequest() {
		return request;
	}

	/**
	 * @param request the request to set
	 */
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	/**
	 * @return the response
	 */
	public HttpServletResponse getResponse() {
		return response;
	}

	/**
	 * @param response the response to set
	 */
	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	/**
	 * @return the session
	 */
	public Map getSession() {
		return session;
	}

	/**
	 * @param session the session to set
	 */
	public void setSession(Map session) {
		this.session = session;
	}
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception{
		
		return executeAction();
	}
	

	/**
	 * @return Context of an action.
	 */
	protected ActionContext getContext(){
		return ActionContext.getContext();
	}
	
	/**
	 * @return SharedData
	 */
	protected SharedData getSharedData(){
		 return (SharedData) session.get(SharedData.SHARED_DATA);
	}

	
	
}
