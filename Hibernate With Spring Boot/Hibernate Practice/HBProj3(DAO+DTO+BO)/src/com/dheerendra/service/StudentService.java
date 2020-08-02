package com.dheerendra.service;

import com.dheerendra.bo.StudentBO;
import com.dheerendra.dao.StudentDAO;
import com.dheerendra.dao.StudentDAOFactory;
import com.dheerendra.dto.StudentDTO;

public class StudentService {

	public String generateResult(StudentDTO dto) {
			int no=0;
		int total=0;
		float avg=0.0f;
		String result=null;
		StudentDAO dao=null;
		total=dto.getM1()+dto.getM2()+dto.getM3();
		avg=total/3;
		int count=0;
		if(avg>=33)
			result="pass";
		else
			result="fail";
		
		StudentBO bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		
		dao=StudentDAOFactory.getInstance();
		no=dao.insert(bo);
		if(no==0) {
			return no+"student avg :"+avg+" result "+result;
		}
		else
			return no+"student avg :"+avg+" result "+result;
		
	
	}
}
