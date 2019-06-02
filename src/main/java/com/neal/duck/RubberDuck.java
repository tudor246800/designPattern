package com.neal.HeadFirstPractise.duck;

import com.neal.HeadFirstPractise.duck.behavior.fly.FlyNoWay;
import com.neal.HeadFirstPractise.duck.behavior.quack.Squeak;

public class RubberDuck extends Duck {
	public RubberDuck(){
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	@Override
	void display() {
		System.out.println("Rubber duck");
	}
	
}
