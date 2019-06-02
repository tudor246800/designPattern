package com.neal.HeadFirstPractise.decorate;

public class StarbuzzCoffee {
	public static void main(String[] args) {
		Beverage beverage = new Espresso(Beverage.TALL);
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);

		System.out.println(beverage.getDescription() + " $" + beverage.cost());
	}
}
