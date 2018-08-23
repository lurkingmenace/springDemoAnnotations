package com.jdivirgilio.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component // Registers as a default bean ID (no parm uses class name)
public class TennisCoach implements Coach {

	@Autowired // Dependency injection
	@Qualifier("happyFortuneService")	
	private FortuneService fortuneService;

	@Autowired // Dependency injection
	public TennisCoach() {

	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Use the serve machine for 1 hour";
	}

	@Override
	public String getFortune() {
		return this.fortuneService.getFortune();
	}

}
