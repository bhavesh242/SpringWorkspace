package com.bhavesh.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach coach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (coach == alphaCoach);
		System.out.println("\nPointing to the same object " + result);
		System.out.println("Memory Locaitons : " + coach);
		System.out.println("Memory Location 2 " + alphaCoach);
		context.close();
	}

}
