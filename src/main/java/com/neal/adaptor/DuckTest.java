package com.neal.HeadFirstPractise.adaptor;

public class DuckTest {
	public static void main(String[] args) {
		WildTurkey wildTurkey = new WildTurkey();
		Duck duck = new TurkeyAdaptor(wildTurkey);
		
		duck.quack();
		duck.fly();
	}
}
