package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach tennisCoach = context.getBean("tennisCoach",Coach.class);//default bean id, lowercase first character and then name of the class
		Coach alphatennisCoach = context.getBean("tennisCoach",Coach.class);//default bean id, lowercase first character and then name of the class
		
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		
		boolean result = (tennisCoach == alphatennisCoach);
		System.out.println(result);
		System.out.println(tennisCoach);
		System.out.println(alphatennisCoach);
		context.close();
	}

}
