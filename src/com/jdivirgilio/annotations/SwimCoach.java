package com.jdivirgilio.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SwimCoach implements Coach {

	@Autowired // Set by reflection..no need for setters
	@Qualifier("fileFortuneService") // Default name of the class
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Swim laps for 1 hour";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
