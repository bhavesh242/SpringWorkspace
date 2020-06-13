package com.bhavesh.spring;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	//Create a no-arg constructor
	
	//add new fields for emailAddress and team
	private String emailAddress;
	private String team;
	private String batsman;
	public String getBatsman() {
		return batsman;
	}

	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("I'm in the setter method for email Address");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("I'm in the setter method for Team");
		this.team = team;
	}

	public CricketCoach() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor called");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("I'm in the setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
