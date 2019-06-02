package com.neal.HeadFirstPractise.template;

public class Caffee extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("brew caffee");
	}

	@Override
	void addCondiment() {
		System.out.println("add milk");

	}

	@Override
	void hook(){
		System.out.println("do sth in the hook");
	}
}
