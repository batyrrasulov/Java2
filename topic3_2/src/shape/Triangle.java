package shape;

import base.ShapeBase;

public class Triangle extends ShapeBase {
	//non-default constructor passed as an argument calling super constructor
	public Triangle(String name, int width, int height) {
		super(name, width, height);
	}
	//calculate and return the area for a triangle
	@Override
	public int calculateArea() {
		return width * height / 2;
	}	
}
