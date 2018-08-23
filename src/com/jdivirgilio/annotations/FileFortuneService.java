package com.jdivirgilio.annotations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
	private List<String> fortunes = new ArrayList<>();
	private Random random = new Random();
	
	public FileFortuneService() {
		System.out.println("FileFortuneService Constructor");
	}
	
	@PostConstruct
	public void getFortunes() {
		System.out.println(Paths.get("").toAbsolutePath());
		try (Stream<String> stream = Files.lines(Paths.get(Paths.get(".").toAbsolutePath().toString(), "src", "fortunes.txt"))) {
			stream.forEach((line) -> fortunes.add(line));
		} catch (IOException e) {
			e.printStackTrace();
		}
		fortunes.stream().forEach((item) -> System.out.println(item));
	}
	
	@Override
	public String getFortune() {
		return fortunes.get(random.nextInt(fortunes.size()));
	}

}
