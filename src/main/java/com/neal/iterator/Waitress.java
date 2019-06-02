package com.neal.HeadFirstPractise.iterator;

public class Waitress {

	MenuComponent allMenues;

	public Waitress(MenuComponent allMenues) {
		this.allMenues = allMenues;
	}

	public void printMenu() {
		allMenues.print();
	}

}
