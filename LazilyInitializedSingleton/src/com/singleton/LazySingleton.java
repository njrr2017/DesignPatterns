package com.singleton;

public class LazySingleton {
	
	private LazySingleton() {
		System.out.println("Ingresando a constructor LazySingleton()");
	}
	
	private static class LazyInnerClass {
		private static final LazySingleton INSTANCE = new LazySingleton();
	}
	
	public static LazySingleton getInstance() {
		return LazyInnerClass.INSTANCE;
	}

}
