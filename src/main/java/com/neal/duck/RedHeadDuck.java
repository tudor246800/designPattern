package com.neal.HeadFirstPractise.duck;

import com.neal.HeadFirstPractise.duck.behavior.fly.FlyNoWay;
import com.neal.HeadFirstPractise.duck.behavior.quack.Quack;

public class RedHeadDuck extends Duck {
	public RedHeadDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}
	@Override
	void display() {
		System.out.println("Red head duck");
	}

}
