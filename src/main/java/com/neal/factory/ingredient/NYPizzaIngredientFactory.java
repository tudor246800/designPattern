package com.neal.HeadFirstPractise.factory.ingredient;

import com.neal.HeadFirstPractise.factory.ingredient.entity.Cheese;
import com.neal.HeadFirstPractise.factory.ingredient.entity.Clams;
import com.neal.HeadFirstPractise.factory.ingredient.entity.Dough;
import com.neal.HeadFirstPractise.factory.ingredient.entity.NormalSauce;
import com.neal.HeadFirstPractise.factory.ingredient.entity.Pepperoni;
import com.neal.HeadFirstPractise.factory.ingredient.entity.Sauce;
import com.neal.HeadFirstPractise.factory.ingredient.entity.ThinCrustDough;
import com.neal.HeadFirstPractise.factory.ingredient.entity.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new NormalSauce();
	}

	public Cheese createCheese() {
		return null;
	}

	public Pepperoni createPepperoni() {
		return null;
	}

	public Clams createClam() {
		return null;
	}

}
