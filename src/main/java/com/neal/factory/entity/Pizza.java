package com.neal.HeadFirstPractise.factory.entity;

import java.util.ArrayList;

import com.neal.HeadFirstPractise.factory.ingredient.entity.Dough;
import com.neal.HeadFirstPractise.factory.ingredient.entity.Sauce;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	public abstract void prepare();

	public void bake(){
		System.out.println("bake...");
	};
	public void cut(){
		System.out.println("cut...");
	};
	public void box(){
		System.out.println("box...");
	}

	public String getName() {
		return name;
	};
	
	
}
