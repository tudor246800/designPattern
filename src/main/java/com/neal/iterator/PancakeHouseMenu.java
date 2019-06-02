package com.neal.HeadFirstPractise.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu extends Menu {
	public PancakeHouseMenu(String name, String description) {
		super(name, description);
	}

	ArrayList<MenuItem> menuItems;

	public Iterator<MenuItem> iterator() {
		return menuItems.iterator();
	}
}
