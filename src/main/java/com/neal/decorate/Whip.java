package com.neal.HeadFirstPractise.decorate;

public class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return .22 + beverage.cost();
	}

	@Override
	public int getSize() {
		return beverage.size;
	}

}
