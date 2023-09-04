package in.sp.Test;

import in.sp.shapes.Circle;
import in.sp.shapes.Shape;

public class Test {
public static void main(String[] args) {
	Shape shape1 =new Circle();
	shape1.draw();
}//Here our internal working of how shape is created is internally knwn but we dont want it to happen so 
//we will use factory method.
}
