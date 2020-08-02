package com.arzds.shape;

public class Square implements IShape {

	public Square() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Square Constructor");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Square Show msg");
	}

	public void shapeMsg() {
		System.out.println("Shape message from Square");
	}

}
