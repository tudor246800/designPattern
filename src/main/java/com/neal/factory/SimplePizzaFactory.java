package com.neal.HeadFirstPractise.factory;

import com.neal.HeadFirstPractise.factory.entity.CheesePizza;
import com.neal.HeadFirstPractise.factory.entity.PepperoniPizza;
import com.neal.HeadFirstPractise.factory.entity.Pizza;

public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza(null);
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza(null);
		}
		return pizza;
	}
}
