package com.bhavesh.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//Load Spring config
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrieve Bean from Spring container
		CricketCoach theCoach = classPathXmlApplicationContext.getBean("myCricketCoach", CricketCoach.class);
		
		//Call methods
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		//Close context
		classPathXmlApplicationContext.close();
		
	}

}
