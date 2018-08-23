package com.jdivirgilio.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") // multiple instances of item - default is singleton 
public class TrackCoach implements Coach {

	@Autowired // Set by reflection..no need for setters
	@Qualifier("fileFortuneService") // Default name of the class
	private FortuneService fortuneService;

	@Value("${my.age}")
	private Integer age;
	
	@Value("${my.address}")
	private String address;
	
	public TrackCoach() {
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "100 meter springs for 10 minutes";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}
	
	@PostConstruct
	public void startupMethod() {
		System.out.println("in the startupMethod");
	}
	
	@PreDestroy // This will not work for prototype scope. You handle it yourself
	public void shutdownMethod() {
		System.out.println("in the shutdownMethod");
	}

}
