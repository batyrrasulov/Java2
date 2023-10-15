package shape;

import base.ShapeBase;

public class Hexagon extends ShapeBase {
	public Hexagon(String name, double side) {
		super(name, side);
		this.side = side;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int calculateArea() {
		return (int) ((int)((int)(Math.sqrt(3) * 3) / 2) * side * side);
	}
}
