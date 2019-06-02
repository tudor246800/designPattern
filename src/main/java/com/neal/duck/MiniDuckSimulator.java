package com.neal.HeadFirstPractise.duck;

import com.neal.HeadFirstPractise.duck.behavior.fly.FlyRocketPower;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		mallard.setFlyBehavior(new FlyRocketPower());
		mallard.performFly();
	}
}
