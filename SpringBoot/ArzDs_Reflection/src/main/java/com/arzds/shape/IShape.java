package com.arzds.shape;

public interface IShape {
	public void showInfo();

	public default void shapeMsg() {
		System.out.println("Welcome to Shape Factory");
	}

	public static void commonMsg() {
		System.out.println("Hello Shape");

	}
}
