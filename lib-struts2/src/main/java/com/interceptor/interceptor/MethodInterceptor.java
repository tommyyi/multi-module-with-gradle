package com.interceptor.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MethodInterceptor extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {

		System.out.println("进入method方法拦截器");
		String  url = arg0.invoke();
		System.out.println("走出method方法拦截器");
		return url;
	}

}
