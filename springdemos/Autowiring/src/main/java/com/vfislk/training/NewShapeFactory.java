package com.vfislk.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class NewShapeFactory {

	//By Type
		@Autowired
		@Qualifier("square")
		IShape shape;
		
		// By Name
		@Autowired
		IShape rectangle;
		
		//by constructor
		IShape triangle;
        @Autowired
		public NewShapeFactory(IShape triangle) {
			super();
			this.triangle = triangle;
		}



		public void printArea(String choice,int length, int breadth) {
			System.out.println("Printing Area");
			if(choice.equals("square"))
			shape.calcArea(length, breadth);
			if(choice.equals("rectangle"))
			rectangle.calcArea(length, breadth);
			if(choice.equals("triangle"))
			triangle.calcArea(length, breadth);
			
		}

}
