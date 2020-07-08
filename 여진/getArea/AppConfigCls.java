package edu.bit.getArea;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigCls {

	@Bean
	public Circle circle(){
		//생성자 셋팅.
		int radius = 5;
		
		Circle circle = new Circle(radius);
		
		return circle;
	}
	
	@Bean
	public Rectangle rectangle(){
		int width = 5;
		int height = 5;
		
		Rectangle rectangle = new Rectangle(width, height);
		
		return rectangle;
	}
	
	@Bean
	public Triangle triangle(){
		int width = 5;
		int height = 5;
		
		Triangle triangle = new Triangle(width, height);
		
		return triangle;
	}
}

