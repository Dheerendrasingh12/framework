package com.arzds.app;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

import com.arzds.model.Address;
import com.arzds.model.Employee;

public class ListMapTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		Address address = new Address();
		address.setAddrId(1);
		address.setLoc("A");
		Address address1 = new Address();
		address1.setAddrId(1);
		address1.setLoc("A");
		List<Address> addresses = Arrays.asList(address, address1);
		employee.setEmpList(addresses);

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Z", 99);
		map.put("Y", 98);
		employee.setEmpMap(map);
		
		try {
			ObjectMapper mapper=new ObjectMapper();
			String jsonStr=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
			System.out.println(jsonStr);
		}catch (Exception e) {
			System.out.println(e);
		}
	
	}
}
