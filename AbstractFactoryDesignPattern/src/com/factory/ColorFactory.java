package com.factory;

import com.color.Brown;
import com.color.Color;
import com.color.White;

public class ColorFactory implements AbstractFactory<Color>{
	
	protected ColorFactory(){}

	@SuppressWarnings("preview")
	@Override
	public Color create(String type) {
		Color color = switch(type) {
			case "Brown", "brown" -> new Brown();
			case "White", "white" -> new White();
			default -> null;
		};
		return color;
	}

}
