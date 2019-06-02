package com.neal.HeadFirstPractise.factory;

import com.neal.HeadFirstPractise.factory.entity.ChicagoCheesePizza;
import com.neal.HeadFirstPractise.factory.entity.ChicagoPepperoniPizza;
import com.neal.HeadFirstPractise.factory.entity.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

//	public ChicagoPizzaStore(SimplePizzaFactory simplePizzaFactory) {
//		super(simplePizzaFactory);
//	}

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new ChicagoCheesePizza(null);
		} else if (type.equals("pepperoni")) {
			pizza = new ChicagoPepperoniPizza(null);
		}
		return pizza;
	}

}
