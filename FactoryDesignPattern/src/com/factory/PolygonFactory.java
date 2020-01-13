package com.factory;

import com.shapes.Pentagon;
import com.shapes.Polygon;
import com.shapes.Square;
import com.shapes.Triangle;

public class PolygonFactory {
    
    @SuppressWarnings("preview")
    public Polygon getPolygon(int numberOfSides) {
	
	Polygon polygon = switch(numberOfSides){
	    case 3 -> new Triangle();
	    case 4 -> new Square();
	    case 5 -> new Pentagon();
	    default -> null;
	};
	return polygon;
    }

}
