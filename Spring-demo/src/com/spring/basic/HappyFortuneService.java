package com.spring.basic;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is indeed lucky!";
	}
	
	
}
