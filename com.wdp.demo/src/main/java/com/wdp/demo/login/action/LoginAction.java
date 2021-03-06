package com.wdp.demo.login.action;

import com.wdp.demo.login.service.LoginService;
import com.wdp.framework.struts2.action.WDPActionSupport;

public class LoginAction extends WDPActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1423790233131607888L;

	private String username;
	private String password;
	private LoginService loginService;
	@Override
	public String executeAction() throws Exception {
		loginService.doLogin();
		// TODO Auto-generated method stub
		if(null != this.getUsername() && this.getUsername().equals(this.getPassword())){
			return "success";
		}else{
			return "error";
		}
		
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the loginService
	 */
	public LoginService getLoginService() {
		return loginService;
	}

	/**
	 * @param loginService the loginService to set
	 */
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

}
