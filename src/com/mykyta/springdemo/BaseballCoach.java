package com.mykyta.springdemo;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	
	public BaseballCoach (FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	public String getDailyWorkout()  {
		return "Send 30 min at smth";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
