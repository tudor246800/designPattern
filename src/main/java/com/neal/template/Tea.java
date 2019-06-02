package com.neal.HeadFirstPractise.template;

public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("brew tea");
	}

	@Override
	void addCondiment() {
		System.out.println("add lemon?");

	}

}
