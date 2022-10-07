package com.vfislk.training;

import org.springframework.stereotype.Component;
@Component
public class Rectangle implements IShape {

	@Override
	public void calcArea(int length, int breadth) {

		int area=(length * length);
		System.out.println("area of rectangle is "+area);
	}

}
