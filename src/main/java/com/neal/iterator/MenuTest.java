package com.neal.HeadFirstPractise.iterator;

public class MenuTest {
	public static void main(String[] args) {
		MenuComponent pancakeMenu = new Menu("pancakeMenu", "pancakeMenu desc");
		MenuComponent dinnerMenu = new Menu("dinnerMenu", "dinnerMenu desc");
		MenuComponent dessertMenu = new Menu("dessertMenu", "dessertMenu desc");

		MenuComponent allMenu = new Menu("All Menu", "desc");

		allMenu.add(pancakeMenu);
		allMenu.add(dinnerMenu);

		dinnerMenu.add(new MenuItem("Dinner 1", "Dinner 1 desc", false, 0.1));
		dinnerMenu.add(new MenuItem("Dinner 2", "Dinner 2 desc", true, 0.2));

		pancakeMenu.add(new MenuItem("Pancake 1", "Pancake 1 desc", false, 0.3));
		pancakeMenu.add(new MenuItem("Pancake 2", "Pancake 2 desc", false, 0.4));

		dinnerMenu.add(dessertMenu);

		dessertMenu.add(new MenuItem("dessert 1", "dessert 1 desc", true, 0.5));
		
		Waitress waitress = new Waitress(allMenu);
		
		allMenu.print();
	}
}
