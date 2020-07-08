package edu.bit.getArea;

public class Triangle implements IShape{
	private int width;
	private int height;
	
	public Triangle() {
		
	}
	
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height * 0.5;
	}

}
