package com.tag.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tag.bean.Users;

public class LoginAction extends ActionSupport{
	//Struts2 valueStack
	private Users us;
	@Override
	public String execute() throws Exception {
		System.out.println(us.getUsername());
		System.out.println(us.getPassword());
		return "success";
	}
	public Users getUs() {
		return us;
	}
	public void setUs(Users us) {
		this.us = us;
	}
	
	
}
