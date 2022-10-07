package com.vfislk.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ShapeFatory {

	@Autowired
//	@Qualifier("rectangle")
	IShape rectangle;
	public void printArea(int length, int breadth) {
		System.out.println("Printing Area");
		rectangle.calcArea(length, breadth);
	}
}
