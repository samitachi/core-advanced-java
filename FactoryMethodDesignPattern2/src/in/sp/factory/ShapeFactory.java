package in.sp.factory;

import in.sp.shapes.Circle;
import in.sp.shapes.Shape;
import in.sp.shapes.Square;
import in.sp.shapes.Triangle;

public class ShapeFactory {
public Shape getShape(String shape_type) {
	if(shape_type.equals("Circle")) {
		return new Circle();
	}
	else if(shape_type.equals("Triangle")) {
		return new Triangle();
	}
	else if(shape_type.equals("Square")) {
		return new Square();
	}
	else {
		return null;
	}
}
}
