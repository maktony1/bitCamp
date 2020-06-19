package edu.bit.ex;

public class RectangleArea {
	int width;
	int height;
	public RectangleArea(int width,int height) {
		this.width=width;
		this.height=height;
	}
	
	public int getArea() {
		return width*height;
	}
}
