package com.singleton;

public class LazyInitializedDoubleCheckSingleton {
	private static LazyInitializedDoubleCheckSingleton INSTANCE;
	
	private LazyInitializedDoubleCheckSingleton(){
	}
	
	public static LazyInitializedDoubleCheckSingleton getInstance() {
		System.out.println("Ingresando a getInstance()");
		if(INSTANCE == null) {
			synchronized (LazyInitializedDoubleCheckSingleton.class) {
				if(INSTANCE == null) {
					INSTANCE = new LazyInitializedDoubleCheckSingleton();
				}
			}
		}
		return INSTANCE;	
	}
}
