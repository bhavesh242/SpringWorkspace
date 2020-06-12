package com.bhavesh.spring;

public class BaseballCoach implements Coach {
	
	//define a private field
	private FortuneService fortuneService;
	
	//Define Constructor
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Spend 20 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
