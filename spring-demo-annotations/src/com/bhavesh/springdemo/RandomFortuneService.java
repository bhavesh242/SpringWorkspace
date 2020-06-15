package com.bhavesh.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String[] data = {"Bhavesh Agrawal", "Steve Menezes", "William Rutherford"};
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index = myRandom.nextInt(data.length);
		String fortune = data[index];
		return fortune;
	}

}
