package com.neal.HeadFirstPractise.singleton;

public class SingletonDoubleCheck {
	private volatile static SingletonDoubleCheck instance;

	private SingletonDoubleCheck() {
	}

	public SingletonDoubleCheck getInstance() {
		if (instance == null) {
			synchronized (SingletonDoubleCheck.class) {
				if (instance == null) {
					instance = new SingletonDoubleCheck();
				}
			}
		}
		return instance;
	}
}
