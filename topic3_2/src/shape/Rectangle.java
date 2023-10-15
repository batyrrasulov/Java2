package shape;

import base.ShapeBase;

public class Rectangle extends ShapeBase{
	//non-default constructor passed as an argument calling super constructor
	public Rectangle(String name, int width, int height) {
		super(name, width, height);
	}
	//calculate and return the area for a rectangle
	@Override
	public int calculateArea() {
		return width * height;
	}
}
