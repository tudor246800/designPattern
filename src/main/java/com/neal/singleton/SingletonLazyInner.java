package com.neal.HeadFirstPractise.singleton;

/**
 * 
 * 加载一个类时，其内部类不会同时被加载。一个类被加载，当且仅当其某个静态成员（静态域、构造器、静态方法等）被调用时发生。
 *
 */
public class SingletonLazyInner {
	private SingletonLazyInner() {
	}
	public static SingletonLazyInner getInstance() {
		return Inner.instance;
	}

	static class Inner {
		private static final SingletonLazyInner instance = new SingletonLazyInner();
	}
}
