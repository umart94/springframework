package com.luv2code.springdemo;

public class TrackCoach implements Coach{

	private FortuneService fortuneService;
	
	
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes walking on the track";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	public void doMyStartupStuff() {
		System.out.println("TrachCoach : Inside method doMyStartupStuff");
	}
	
	public void doMyCleanupStuff() {
		System.out.println("TrachCoach : Inside method doMyCleanupStuff");
	}
	
}
