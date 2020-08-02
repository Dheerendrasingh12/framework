package com.arzds.shape;

import java.util.Scanner;

public class ShapeTest {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Chose One Optio");
		System.out.println("1. Circle \n2. Square\n 3. Trinangle");
		int ch = scn.nextInt();
		if (ch > 0 && ch < 4) {
			IShape iShape = ShapeFactory.getShape(ch);
			iShape.showInfo();
			IShape.commonMsg();
		} else
			System.out.println("Invalide Selection");
		scn.close();
	}

}
