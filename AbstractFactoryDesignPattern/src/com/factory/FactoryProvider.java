package com.factory;

public class FactoryProvider {
	
	@SuppressWarnings("preview")
	public static AbstractFactory<?> getFactory(String type) {
		AbstractFactory<?> abstractFactory = 
				switch(type) {
					case "Toy", "toy" -> new AnimalFactory();
					case "Color", "color" -> new ColorFactory();
					default -> null;
		};
		return abstractFactory;
	}

}
