package com.java.service;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionHandler implements ThrowsAdvice{

	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
		System.out.println("Exception raised while calling method "+ method.getName());
		ex.printStackTrace();
	}
}
