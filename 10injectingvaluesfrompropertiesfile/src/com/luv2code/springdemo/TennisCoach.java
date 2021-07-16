package com.luv2code.springdemo;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("tennisCoach")
@Component
//@Scope("singleton")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
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

	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("inside do my startup stuff tennis coach");
	}
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("inside do my cleanup stuff tennis coach");
	}

	

	

}
