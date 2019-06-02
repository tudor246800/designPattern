package com.neal.HeadFirstPractise.iterator;

import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class DinnerMenuIterator implements Iterator {
	MenuItem[] menuItems;
	int pos = 0;

	public DinnerMenuIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}

	public boolean hasNext() {
		if (pos >= menuItems.length || menuItems[pos] == null)
			return false;
		else
			return true;
	}

	public MenuItem next() {
		MenuItem menuItem = menuItems[pos];
		pos++;
		return menuItem;
	}

	public void remove() {
		if (pos <= 0) {
			throw new IllegalStateException();
		}
		if (menuItems[pos - 1] != null) {
			for (int i = pos - 1; i < menuItems.length; i++) {
				menuItems[i] = menuItems[i + 1];
			}
			menuItems[menuItems.length - 1] = null;
		}
	}

}
