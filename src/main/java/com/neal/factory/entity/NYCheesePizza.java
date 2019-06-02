package com.neal.HeadFirstPractise.factory.entity;

import com.neal.HeadFirstPractise.factory.ingredient.PizzaIngredientFactory;

public class NYCheesePizza extends CheesePizza {

	public NYCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		super(pizzaIngredientFactory);
	}
}
