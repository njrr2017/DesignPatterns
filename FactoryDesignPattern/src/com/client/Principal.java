package com.client;

import com.factory.PolygonFactory;
import com.shapes.Polygon;

public class Principal {

    public static void main(String[] args) {
	Polygon polygon;
	PolygonFactory polygonFactory = new PolygonFactory();
	int numberOfSides = 3;
	polygon = polygonFactory.getPolygon(numberOfSides);
	System.out.println("The Shape with "+numberOfSides+" sides is a "+ polygon.getType());
	
	numberOfSides = 4;
	polygon = polygonFactory.getPolygon(numberOfSides);
	System.out.println("The Shape with "+numberOfSides+" sides is a "+ polygon.getType());
	
	numberOfSides = 5;
	polygon = polygonFactory.getPolygon(numberOfSides);
	System.out.println("The Shape with "+numberOfSides+ " sides is a "+ polygon.getType());
    }

}
