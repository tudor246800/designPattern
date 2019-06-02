package com.neal.HeadFirstPractise.factory;

import com.neal.HeadFirstPractise.factory.entity.Pizza;

public abstract class PizzaStore {
//	SimplePizzaFactory simplePizzaFactory;
//
//	public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
//		this.simplePizzaFactory = simplePizzaFactory;
//	}

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;

	}

	public abstract Pizza createPizza(String type);
}
