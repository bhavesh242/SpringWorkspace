package com.bhavesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopedemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = theCoach == alphaCoach;
		
		System.out.println("\nPointing out to the same result " + result);
		System.out.println(theCoach);
		System.out.println(alphaCoach);
		context.close();
	}

}
