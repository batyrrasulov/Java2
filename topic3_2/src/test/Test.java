package test;

import shape.Circle;
import shape.Hexagon;
import shape.Rectangle;
import base.ShapeBase;
import shape.Triangle;

public class Test {
	//create a private helper method that prints shape's name and area
	private static void displayArea(ShapeBase shape) {
		System.out.println("This is a shape named " + shape.getName() + " with an area of " + shape.calculateArea());
	}
public static void main(String[] args) {
	//create a method scoped variable that holds 4 shapes
	//creates an array of Base Shapes and initialize to specific shapes
	ShapeBase[] shapes = new ShapeBase[4];
	//initialize first array element with an instance of a Rectangle
	shapes[0] = new Rectangle("Rectangle", 10, 200);
	//initialize first array element with an instance of a Triangle
	shapes[1] = new Triangle("Triangle", 10, 50);
	//initialize first array element with an instance of a Circle
	shapes[2] = new Circle("Circle", 56);
	//initialize first array element with an instance of a regular Hexagon
	shapes[3] = new Hexagon("Hexagon", 20);
	//for all shapes display its area and loope over the array with helper method
	for (int x = 0; x < shapes.length; x++) {
		displayArea(shapes[x]);
	}
}
}
