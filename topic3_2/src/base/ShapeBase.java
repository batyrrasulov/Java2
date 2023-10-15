package base;

public class ShapeBase implements ShapeInterface{
	//three protected class member variables 
	protected String name;
	protected int width, height;
	protected double radius;
	protected double side;
	//non-default constructor initializes and is passed the variables as arguments
	public ShapeBase(String name, int width, int height) {
		this.name = name;
		this.width = width;
		this.height = height;
	}
	public ShapeBase(String name, double radius) {
		this.name = name;
		this.radius = radius;
	}
	//getters for above variables
	public String getName() {
		return this.name;
	}
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	public int getRadius() {
		return (int) this.radius;
	}
	public int getSide() {
		return (int) this.side;
	}
	@Override
	//implement this method which returns a -1
	public int calculateArea() {
		return -1;
	}
}
