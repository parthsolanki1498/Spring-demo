package com.spring.annotations;


public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is sad day :(";
	}

}
