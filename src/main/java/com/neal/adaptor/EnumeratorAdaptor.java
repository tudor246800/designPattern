package com.neal.HeadFirstPractise.adaptor;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumeratorAdaptor implements Iterator {
	Enumeration enumeration;
	
	public EnumeratorAdaptor(Enumeration enumeration) {
		super();
		this.enumeration = enumeration;
	}

	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	public Object next() {
		return enumeration.nextElement();
	}

}
