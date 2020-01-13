package com.client;

import com.animal.Animal;
import com.color.Color;
import com.factory.AbstractFactory;
import com.factory.FactoryProvider;

public class Principal {

	public static void main(String[] args) {
		 
		AbstractFactory abstractFactory = FactoryProvider.getFactory("Toy");
		Animal dog = (Animal) abstractFactory.create("Dog");
		Animal duck = (Animal) abstractFactory.create("duck");
		abstractFactory = FactoryProvider.getFactory("Color");
		Color brownColor = (Color) abstractFactory.create("Brown");
		Color white = (Color) abstractFactory.create("white");
		System.out.println("A "+dog.getAnimal()+" with color "+brownColor.getColor()+
				" sounds like "+dog.makeSound());
		System.out.println("A "+duck.getAnimal()+" with color "+white.getColor()+
				" sounds like "+duck.makeSound());
		
		
	}

}
