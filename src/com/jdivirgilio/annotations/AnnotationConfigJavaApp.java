package com.jdivirgilio.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigJavaApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
				
//		TrackCoach theCoach = context.getBean("trackCoach", TrackCoach.class);
//		
//		System.out.println(theCoach.getFortune());
//		
//		System.out.println(theCoach.getAge());
//		System.out.println(theCoach.getAddress() + "\n");		
//		
		
		SwimCoach sCoach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(sCoach.getFortune());
		System.out.println(sCoach.getDailyWorkout());
		context.close();
	}

}
