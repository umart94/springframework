package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		//Coach theCoach = context.getBean("tennisCoach",Coach.class);
		//System.out.println(theCoach.getDailyFortune());
		//System.out.println(theCoach.getDailyWorkout());
		
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		context.close();
		
	}
}
