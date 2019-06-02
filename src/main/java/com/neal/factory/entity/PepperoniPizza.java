package com.neal.HeadFirstPractise.factory.entity;

import com.neal.HeadFirstPractise.factory.ingredient.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;

	public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
	}
	
	

}
