package com.neal.HeadFirstPractise.duck;

import com.neal.HeadFirstPractise.duck.behavior.fly.FlyWithWings;
import com.neal.HeadFirstPractise.duck.behavior.quack.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	void display() {
		System.out.println("Green head duck");
	}

}
