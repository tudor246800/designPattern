package com.neal.HeadFirstPractise.template;

public abstract class CaffeineBeverage {

	final void prepare() {
		boilWater();
		brew();
		pourInCup();
		addCondiment();
		hook();
	}

	abstract void brew();
	
	abstract void addCondiment();

	final void boilWater() {
		System.out.println("Boil water");
	}

	final void pourInCup() {
		System.out.println("Pour in cup");
	}
	
	void hook(){};
}
