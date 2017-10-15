package com.interceptor.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	@Override
	public String execute() throws Exception {
		
		if(username.equals("admin")){
			ServletActionContext.getRequest().getSession().setAttribute("username", "admin");
			return SUCCESS;
		}else{
			return "loginfail";
		}
		
		
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
