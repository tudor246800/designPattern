package com.neal.HeadFirstPractise.factory.ingredient;

import com.neal.HeadFirstPractise.factory.ingredient.entity.Cheese;
import com.neal.HeadFirstPractise.factory.ingredient.entity.Clams;
import com.neal.HeadFirstPractise.factory.ingredient.entity.Dough;
import com.neal.HeadFirstPractise.factory.ingredient.entity.Pepperoni;
import com.neal.HeadFirstPractise.factory.ingredient.entity.Sauce;

public interface PizzaIngredientFactory {

	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();
	
	public Pepperoni createPepperoni();
	
	public Clams createClam();

}
