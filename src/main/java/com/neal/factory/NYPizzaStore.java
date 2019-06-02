package com.neal.HeadFirstPractise.factory;

import com.neal.HeadFirstPractise.factory.entity.NYCheesePizza;
import com.neal.HeadFirstPractise.factory.entity.NYPepperoniPizza;
import com.neal.HeadFirstPractise.factory.entity.Pizza;
import com.neal.HeadFirstPractise.factory.ingredient.NYPizzaIngredientFactory;
import com.neal.HeadFirstPractise.factory.ingredient.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {
	PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new NYCheesePizza(pizzaIngredientFactory);
		} else if (type.equals("pepperoni")) {
			pizza = new NYPepperoniPizza(pizzaIngredientFactory);
		}
		return pizza;
	}

}
