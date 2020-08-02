package com.arzds.shape;

public class ShapeFactory {
	public static IShape getShape(int ch) {
		String cls = choose(ch);
		IShape iShape = null;
		try {
			Object object = Class.forName(cls).newInstance();
			if (object instanceof IShape)
				iShape = (IShape) object;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return iShape;
	}

	private static String choose(int ch) {
		String cls = null;
		switch (ch) {
		case 1:
			cls = "com.arzds.shape.Circle";
			break;

		case 2:
			cls = "com.arzds.shape.Square";
			break;
		case 3:
			cls = "com.arzds.shape.Triangle";
			break;
		default:
			break;
		}
		return cls;
	}
}
