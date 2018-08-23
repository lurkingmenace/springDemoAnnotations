package com.jdivirgilio.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.jdivirgilio.annotations") Automatically finds beans/components...without this you specify as @Bean below
@PropertySource("classpath:tennis.properties")
public class SpringConfiguration {

	//Define beans
	@Bean
	public Coach swimCoach() {
		return  new SwimCoach();
	}
	
	@Bean
	public FortuneService fileFortuneService() {
		return new FileFortuneService();
	}
	
}
