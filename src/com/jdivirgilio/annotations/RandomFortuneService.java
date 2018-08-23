package com.jdivirgilio.annotations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private List<String> fortunes = new ArrayList<>(3);
	private Random random = new Random();
	
	public RandomFortuneService() {
		Collections.addAll(fortunes,"You will live long and prosper","Beware of today","Easy sailing from here out");
	}
	
	@Override
	public String getFortune() {
		
		return fortunes.get(random.nextInt(fortunes.size())); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
