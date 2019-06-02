package com.neal.HeadFirstPractise.factory;

import com.neal.HeadFirstPractise.factory.entity.Pizza;

public class StoreTest {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		Pizza pizza=nyStore.orderPizza("cheese");
		System.out.println(pizza.getName() + " " );
		
//		PizzaStore chicagoStore = new ChicagoPizzaStore();
//		Pizza pizza2=chicagoStore.orderPizza("cheese");
//		System.out.println(pizza2.getName() + " " );
	}
}
