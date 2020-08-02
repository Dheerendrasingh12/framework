package com.dheerendra.test;
import java.util.Scanner;

import com.dheerendra.controller.StudentController;
import com.dheerendra.utility.HibernateUtil;

public class ClientApp {

	public static void main(String[] args) {
		StudentController control=null;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter id");
		int sno=scn.nextInt();
		scn.nextLine();
		System.out.println("enter name");
		String name=scn.nextLine();
		System.out.println("enter marks1");
		int m1=scn.nextInt();
		scn.nextLine();
		System.out.println("enter marks2");
		int m2=scn.nextInt();
		scn.nextLine();
		System.out.println("enter marks3");
		int m3=scn.nextInt();
		control=new StudentController();
		String result=control.process(sno, name, m1, m2, m3);
		System.out.println("Result ::"+result);
		
		HibernateUtil.closeSessionFactory();
		
		
	}
}
