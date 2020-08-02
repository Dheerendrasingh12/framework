package com.arzds.shape;

public class Circle implements IShape {

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Circle Constructor");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Circle Show msg");
	}

	public void shapeMsg() {
		System.out.println("Shape message from Circle");
	}

}
