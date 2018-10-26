package com.java.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LoggingService {

	//access-modifier 	return	method-name	(arguments)
	@Around(value = "execution(public * com.java.business.Calculator.*(..))")
	public Object logging(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Entering method "+pjp.getSignature());
		int x= (int) pjp.proceed();
		System.out.println("Exiting method "+ pjp.getSignature());
		return x;
		
	}
	
	//within: all methods inside this calculator class
	@AfterThrowing(throwing="ex", pointcut="within(com.java.business.Calculator)")
	public void exceptionHandler(Exception ex) {
		System.out.println("Exception raised!!");
	}
	
	@AfterReturning(returning="returnedValue", pointcut="@within(org.springframework.stereotype.Repository)")
	public void commitService(Object returnedValue ) {
		System.out.println("commited");
	}
}
