package com.neal.HeadFirstPractise.decorate;

public class Mocha extends CondimentDecorator {
	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		switch (beverage.size) {
		case Beverage.TALL:
			cost += .10;
			break;
		case Beverage.GRANDE:
			cost += .20;
			break;
		case Beverage.VENTI:
			cost += .30;
			break;
		default:
			break;
		}
		return cost;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return beverage.getSize();
	}

}
