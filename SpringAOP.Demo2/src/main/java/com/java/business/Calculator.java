package com.java.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.dao.MyRepository;

@Component
public class Calculator {
	
	@Autowired MyRepository rep;
	
	public int add(int a, int b) {
		System.out.println("In add");
		rep.addData();
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public int div(int a, int b) {
		return a/b;
	}
}


//spring aop : separate my business logic with my service code