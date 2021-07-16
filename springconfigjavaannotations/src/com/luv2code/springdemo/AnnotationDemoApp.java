package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach tennisCoach = context.getBean("tennisCoach",Coach.class);//default bean id, lowercase first character and then name of the class
		
		System.out.println(tennisCoach.getDailyWorkout());
		context.close();
	}
}
