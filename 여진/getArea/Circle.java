package edu.bit.getArea;

public class Circle implements IShape{
	private int radius;
	
	public Circle() {
		
	}
	
	public Circle(int r) {
		radius = r;
	}
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

}
