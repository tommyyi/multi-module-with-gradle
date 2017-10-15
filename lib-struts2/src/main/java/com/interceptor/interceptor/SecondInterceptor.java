package com.interceptor.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class SecondInterceptor implements Interceptor {

	public void destroy() {

	}
	public void init() {
	}

	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("进入Second拦截器");
		String returnName = arg0.invoke();
		System.out.println("走出Second拦截器");
		return returnName;
	}



}
