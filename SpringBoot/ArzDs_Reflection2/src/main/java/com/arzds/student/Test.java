package com.arzds.student;

public class Test {
	public static void main(String[] args) throws Exception {
		Class c=Class.forName(args[0]);
		Object object=c.newInstance();
		if(object instanceof IModel) {
			IModel iModel=(IModel) object;
			System.out.println(iModel.getModelName());
			System.out.println(iModel.getModelObj());
		}
	}
}
