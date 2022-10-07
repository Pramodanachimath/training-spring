package com.vfislk.training;

import org.springframework.stereotype.Component;

@Component
public class Square implements IShape {

	@Override
	public void calcArea(int length, int breadth) {

		int area=(length* breadth);
		System.out.println("area of square is "+area);
	}

}
