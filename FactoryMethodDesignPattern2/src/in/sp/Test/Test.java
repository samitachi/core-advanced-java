package in.sp.Test;

import in.sp.factory.ShapeFactory;
import in.sp.shapes.Circle;
import in.sp.shapes.Shape;

public class Test {
	public static void main(String[] args) {
		ShapeFactory shape_factory = new ShapeFactory();
		Shape shape1 = shape_factory.getShape("Circle");
		shape1.draw();
	}
}
/*Output:
Circle shape is created

Now the internal working is hidden.Shape Factory is doing all the things.*/