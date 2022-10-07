package com.vfislk.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {

//		IShape shape=new Triangle();
//		shape.calcArea(10, 8);
//		
//		shape=new Rectangle();
//		shape.calcArea(10, 15);
//		
//		shape=new Square();
//		shape.calcArea(10, 1);
		
		
		ApplicationContext context=new AnnotationConfigApplicationContext("com.vfislk.training");
		
		ShapeFatory factory=context.getBean(ShapeFatory.class,"shapeFactory");
		factory.printArea(10, 20);
		System.out.println();
		
		NewShapeFactory shapeFactory=context.getBean(NewShapeFactory.class,"newShapeFactory");
		shapeFactory.printArea("triangle",10, 20);
	}

}
