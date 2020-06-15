package com.bhavesh.spring;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it" + fortuneService.getFortune();
	}
	
	//add init method
	public void doMystartupStuff() {
		System.out.println("trackcoach : inside my init method");
	}
	
	//Destroy method
	public void doMyCleanUpstuff() {
		System.out.println("trackCoach : inside my destroy method");
	}


}
