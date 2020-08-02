package com.arzds;

public class Test {

	public static void main(String[] args) {

		new Sample() {
			public void show() {
				System.out.println("H1");
			}
		};
	}
}
