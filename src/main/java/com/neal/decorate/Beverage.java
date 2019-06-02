package com.neal.HeadFirstPractise.decorate;

public abstract class Beverage {
	String description = "Unknown Beverage";
	int size;
	public static final int TALL = 0;
	public static final int GRANDE = 1;
	public static final int VENTI = 2;
 
	public String getDescription() {
		return description;
	}

	public abstract int getSize();

	public abstract double cost();
}
