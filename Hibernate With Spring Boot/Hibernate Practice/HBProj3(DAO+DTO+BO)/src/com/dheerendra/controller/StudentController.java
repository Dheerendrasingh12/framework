package com.dheerendra.controller;

import com.dheerendra.dto.StudentDTO;
import com.dheerendra.service.StudentService;

public class StudentController {

	public String process(int sno,String sname,int m1,int m2,int m3) {
		StudentDTO dto=null;
		String result=null;
		StudentService ser=null;
		dto=new StudentDTO();
		dto.setSno(sno);
		dto.setSname(sname);
		dto.setM1(m1);
		dto.setM2(m2);
		dto.setM3(m3);
		ser=new StudentService();
		result=ser.generateResult(dto);
		return result;
		
		
		
	}
}
