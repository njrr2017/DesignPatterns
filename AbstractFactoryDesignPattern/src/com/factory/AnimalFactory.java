package com.factory;

import com.animal.Animal;
import com.animal.Dog;
import com.animal.Duck;

public class AnimalFactory implements AbstractFactory<Animal>{
	
	 AnimalFactory(){}

	@SuppressWarnings("preview")
	@Override
	public Animal create(String type) {
		Animal animal = switch(type){
			case "Dog", "dog"-> new Dog();
			case "Duck", "duck"-> new Duck();
			default-> null;
		};
		return animal;
	}

}
