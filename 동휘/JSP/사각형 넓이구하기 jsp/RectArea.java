package edu.bit.ex;

public class RectArea {
		int width,height;
		
	public RectArea(String StrWidth,String StrHeight) {
		width=Integer.parseInt(StrWidth);
		height=Integer.parseInt(StrHeight);
	}
	
	public int getArea() {
		return width*height;
	}
}
