package com.jdivirgilio.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanAnnotationDemoApp {

	public static void main(String[] args) {
		// load the spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanAnnotation.xml");
		
		// retrieve beans from container
		TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		Coach theCoach2 = context.getBean("tennisCoach", Coach.class);

		if (theCoach == theCoach2) {
			System.out.println("They're equal");
		}
		else {
			System.out.println("They're not equal");
		}
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getFortune());
		

		TrackCoach tCoach = context.getBean("trackCoach", TrackCoach.class);
		
		System.out.println(tCoach.getDailyWorkout());
		System.out.println(tCoach.getAge());
		System.out.println(tCoach.getAddress());
		System.out.println(tCoach.getFortune());
		
		context.close(); // if you don't have this the destroy-method will not get called
	}

}
