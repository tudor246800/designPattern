package com.neal.HeadFirstPractise.factory.entity;

import com.neal.HeadFirstPractise.factory.ingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;

	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
	}
	
}
