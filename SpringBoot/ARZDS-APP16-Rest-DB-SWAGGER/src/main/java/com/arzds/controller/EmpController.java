package com.arzds.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arzds.model.Employee;
import com.arzds.service.EmpService;

@RestController
@RequestMapping("/home")
public class EmpController {
	private static Logger log = LogManager.getLogger(EmpController.class);

	@Autowired
	private EmpService empService;

	@PostMapping("/store")
	public ResponseEntity<String> saveEmp(@RequestBody Employee employee) {
		ResponseEntity<String> response = null;
		log.debug("Entering");
		int id = 0;
		try {
			id = empService.saveEmp(employee);
			response = new ResponseEntity<String>("Emp " + id + "Stored into DB", HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Exception " + e);
			response = new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

		}
		log.debug("Leaving");
		return response;
	}

	@GetMapping("/fetchAll")
	public ResponseEntity<?> getAllEmp() {
		ResponseEntity<?> response = null;
		log.debug("Entering");
		try {
			List<Employee> empData = empService.getEmp();
			if (empData == null || empData.isEmpty())
				response = new ResponseEntity<>("No Record Found ", HttpStatus.OK);
			else
				response = new ResponseEntity<List<Employee>>(empData, HttpStatus.OK);

		} catch (Exception e) {
			// TODO: handle exception
			log.error("Entering");
			response = new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

		}
		log.debug("Leaving");
		return response;
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> removedById(@PathVariable int id) {
		ResponseEntity<String> response = null;

		log.debug("Entering");
		try {
			if (empService.isPresent(id)) {
				int delete = empService.delete(id);
				if (delete > 0)
					response = new ResponseEntity<String>("Employee Removed Sucessfully", HttpStatus.OK);
				else
					throw new Exception();
			} else {
				response = new ResponseEntity<String>(id + " not found", HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Entering");
			response = new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		log.debug("Leaving");
		return response;
	}

	@PutMapping("/update")
	public <T> ResponseEntity<T> updateEmp(@RequestBody Employee employee) {
		ResponseEntity<T> response = null;

		log.debug("Entering");
		try {
			if (empService.isPresent(employee.getEmpId())) {
				int update=empService.update(employee);
				if (update > 0)
					response = new ResponseEntity<T>((T) "Employee Removed Sucessfully", HttpStatus.OK);
				else
					throw new Exception();
			} else {
				response = new ResponseEntity<T>((T) (employee.getEmpId() + " not found"), HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Entering");
			response = new ResponseEntity<T>((T) e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		log.debug("Leaving");
		return response;

	}
}
