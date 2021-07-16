package com.luv2code.springdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("tennisCoach")
@Component
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	
	public TennisCoach() {
		
	}
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice your backhand volley";	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}


	

	

}
