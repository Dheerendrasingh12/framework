package com.arzds;

public class Test {
	public static void main(String[] args) {

		Creator c;
		c = (i, j) -> {
			return i+j;
		};
		String m = c.createMsg("Hello ArzDs", 0);
		System.out.println(m);
	}

}