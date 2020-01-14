package com.principal;

import com.singleton.LazyInitializedDoubleCheckSingleton;

public class Principal {

	public static void main(String[] args) {
		Hilo1 h1 = new Hilo1();
		Hilo2 h2 = new Hilo2();
		Hilo3 h3 = new Hilo3();
		Thread t1 = new Thread(h1);
		Thread t2 = new Thread(h2);
		Thread t3 = new Thread(h3);
		t1.start();
		t2.start();
		t3.start();
		boolean h1EqualH2 = h1.sing == h2.sing; 
		System.out.println("h1EqualH2 = "+h1EqualH2);
		boolean h1EqualH3 = h1.sing == h3.sing; 
		System.out.println("h1EqualH3 = "+h1EqualH3);
	}

}

class Hilo1 implements Runnable{
	LazyInitializedDoubleCheckSingleton sing;

	@Override
	public void run() {
		sing = LazyInitializedDoubleCheckSingleton.getInstance();
	}
}

class Hilo2 implements Runnable{
	LazyInitializedDoubleCheckSingleton sing;

	@Override
	public void run() {
		sing = LazyInitializedDoubleCheckSingleton.getInstance();
	}
}

class Hilo3 implements Runnable{
	LazyInitializedDoubleCheckSingleton sing;

	@Override
	public void run() {
		sing = LazyInitializedDoubleCheckSingleton.getInstance();
	}
}