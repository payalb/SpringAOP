package com.java.client;

import org.springframework.aop.framework.ProxyFactoryBean;

import com.java.business.Calculator;
import com.java.service.ExceptionHandler;
import com.java.service.LoggingService;

public class Main {

	public static void main(String[] args) {
		Calculator target= new Calculator();
		LoggingService service= new LoggingService();
		ExceptionHandler handler= new ExceptionHandler();
		
		ProxyFactoryBean bean= new ProxyFactoryBean();
		bean.setTarget(target);
		bean.addAdvice(service);
		bean.addAdvice(handler);

		//At runtime, it will weave ur business logic with the service code: proxy class
		Calculator proxy=(Calculator) bean.getObject();
		proxy.add(3, 4);
		
		
	}

}
