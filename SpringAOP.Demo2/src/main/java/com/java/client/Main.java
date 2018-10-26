package com.java.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.java.business.Calculator;
import com.java.config.SpringConfig;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx= new AnnotationConfigApplicationContext(SpringConfig.class);
		Calculator proxy=ctx.getBean(Calculator.class);
		proxy.add(3, 4);
		proxy.sub(3, 4);
		proxy.mul(3, 4);
		proxy.div(3, 4);
		ctx.close();
	}

}
