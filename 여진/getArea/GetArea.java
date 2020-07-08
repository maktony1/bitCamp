package edu.bit.getArea;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GetArea{
    public static void main( String[] args ){
    	
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigCls.class);
		
    	Circle c = ctx.getBean("circle", Circle.class);
    	System.out.println(c.getArea());
    	
    	Rectangle r = ctx.getBean("rectangle", Rectangle.class);
    	System.out.println(r.getArea());
    	
    	Triangle t = ctx.getBean("triangle", Triangle.class);
    	System.out.println(t.getArea());
    	
    }
}
