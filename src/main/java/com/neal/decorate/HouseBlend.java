package com.neal.HeadFirstPractise.decorate;

public class HouseBlend extends Beverage {

	public HouseBlend(int size) {
		description = "HouseBlend";
		this.size = size;
	}

	@Override
	public double cost() {
		return .89;
	}

	@Override
	public int getSize() {
		return size;
	}
}
