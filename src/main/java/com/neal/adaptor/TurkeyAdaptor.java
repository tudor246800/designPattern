package com.neal.HeadFirstPractise.adaptor;

public class TurkeyAdaptor implements Duck {
	Turkey turkey;
	
	
	public TurkeyAdaptor(Turkey turkey) {
		this.turkey = turkey;
	}

	public void quack() {
		turkey.gobble();

	}

	public void fly() {
		turkey.fly();
	}

}
