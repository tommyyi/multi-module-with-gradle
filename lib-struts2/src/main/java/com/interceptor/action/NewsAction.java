package com.interceptor.action;

import com.opensymphony.xwork2.ActionSupport;

public class NewsAction extends ActionSupport{
	public String add() throws Exception {
		System.out.println("进入News add方法");
		return "Newssuccess";
	}
	public String show() throws Exception {
		System.out.println("进入News show方法");
		return "Newssuccess";
	}
	public String update() throws Exception {
		System.out.println("进入News update方法");
		return "Newssuccess";
	}
	public String delete() throws Exception {
		System.out.println("进入News delete方法");
		return "Newssuccess";
	}
}
