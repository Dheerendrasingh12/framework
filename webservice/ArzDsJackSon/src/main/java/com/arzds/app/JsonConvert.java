package com.arzds.app;

import org.codehaus.jackson.map.ObjectMapper;

import com.arzds.model.Address;
import com.arzds.model.Employee;

public class JsonConvert {
	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setEmpId(12);
		employee.setEmpName("ArzDs");
		employee.setEmpSal(80.00);
		employee.setEmpPwd("DsArz");
		Address address = new Address();
		address.setAddrId(3);
		address.setLoc("myHeart");
		employee.setAddress(address);
		String jsonString = javaToJson(employee);
		Employee employee2 = (Employee) jsonToJava(jsonString, Employee.class);
		System.out.println(employee2);
		System.out.println(employee2.getEmpName());
	}

	public static Object jsonToJava(String value, Object cls) {

		try {
			ObjectMapper mapper = new ObjectMapper();
			Object obj = mapper.readValue(value, cls.getClass());
			return obj;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	public static String javaToJson(Object object) {
		String jsonStr = null;
		try {
			ObjectMapper om = new ObjectMapper();
			jsonStr = om.writeValueAsString(object);
			System.out.println(jsonStr + "\n\n");

			System.out.println("Print as Pretty Fromat");
			jsonStr = om.writerWithDefaultPrettyPrinter().writeValueAsString(object);
			System.out.println(jsonStr);

		} catch (Exception e) {
			System.out.println(e);
		}
		return jsonStr;
	}
}
