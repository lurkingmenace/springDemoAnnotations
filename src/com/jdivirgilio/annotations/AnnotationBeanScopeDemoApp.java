package com.jdivirgilio.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationBeanScope.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("trackCoach", Coach.class); // Track coach has an annotation @Scope("prototype")
		
		Coach the2ndCoach = context.getBean("trackCoach", Coach.class);
		
		boolean result =  theCoach == the2ndCoach;
		
		System.out.println("Equality = " + result);

		System.out.println("theCoach address = " + theCoach);
		System.out.println("the2ndCoach address = " + the2ndCoach);
		
		context.close();
	}
}
