package com.mykyta.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomFortuneService implements FortuneService {
	private List<String> list;
	
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public RandomFortuneService() {
		
	}
	
	@Override
	public String getFortune() {
		int randomElementIndex = ThreadLocalRandom.current().nextInt(0, list.size() + 1);
		return list.get(randomElementIndex);
	}
	
	

}
