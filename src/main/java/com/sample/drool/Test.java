package com.sample.drool;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"Spring.xml"});
		DroolService droolService = (DroolService)context.getBean("droolService");
		droolService.executeRule();
		droolService.test();
		//System.out.println();

	}
}
