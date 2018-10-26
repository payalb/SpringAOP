package com.java.service;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//Around advice
public class LoggingService implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("entering method "+ invocation.getMethod().getName()); 
		int x=(int) invocation.proceed(); //go and call business method
		System.out.println("Exiting method "+invocation.getMethod().getName()); 
		return x;
	}

	

}
