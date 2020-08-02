package com.arzds.shape;

public class Triangle implements IShape {

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Triangle Constructor");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Triangle Show msg");
	}

	public void shapeMsg() {
		System.out.println("Shape message from Triangle");
	}

}
