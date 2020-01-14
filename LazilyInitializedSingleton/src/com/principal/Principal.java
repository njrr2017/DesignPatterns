package com.principal;

import com.singleton.LazySingleton;

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
		boolean areEqual = h1.object1 == h2.object2;
		boolean areEqual2 = h2.object2 == h3.object3;
		System.out.println(areEqual+"-"+areEqual2);
	}

}

class Hilo1 implements Runnable{
	LazySingleton object1;
	
	@Override
	public void run() {
		object1 =  LazySingleton.getInstance();
	}
}

class Hilo2 implements Runnable{
	LazySingleton object2;
	
	@Override
	public void run() {
		object2 =  LazySingleton.getInstance();
	}
}

class Hilo3 implements Runnable{
	LazySingleton object3;
	
	@Override
	public void run() {
		object3 =  LazySingleton.getInstance();
	}
}
