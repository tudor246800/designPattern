package com.neal.HeadFirstPractise.iterator;

import java.util.Iterator;

public class DinnerMenu extends Menu{
	public DinnerMenu(String name, String description) {
		super(name, description);
	}


	MenuItem[] menuItems;
	
	
	public Iterator<MenuItem> iterator(){
		return new DinnerMenuIterator(menuItems);
	}
}
