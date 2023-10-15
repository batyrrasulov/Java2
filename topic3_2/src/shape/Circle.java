package shape;

import base.ShapeBase;

public class Circle extends ShapeBase{
	public Circle(String name, double radius) {
		super(name, radius);
		this.radius = radius;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRadius() {
		return (int) this.radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public int calculateArea() {
		return (int) ((int) Math.PI * radius * radius);
	}
}
