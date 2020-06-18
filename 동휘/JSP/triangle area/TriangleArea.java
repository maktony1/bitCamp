package edu.bit.ex;

public class TriangleArea {
	int width,height;
	
	public TriangleArea(int width,int height) {
		this.width=width;
		this.height=height;
	}
	
	public int getArea() {
		return (width*height/2);
	}
}
