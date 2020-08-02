package com.arzds.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arzds.model.Student;
import com.arzds.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentReStController {
	@Autowired
	StudentService service;

	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Student student) {
		ResponseEntity<String> resp = null;
		try {
			if (service.save(student)) {
				resp = new ResponseEntity<>("Done", HttpStatus.ACCEPTED);
				return resp;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		resp = new ResponseEntity<String>("Failed", HttpStatus.BAD_REQUEST);
		return resp;
	}

	@GetMapping("/all")
	public ResponseEntity<?> getAll() {
		ResponseEntity<?> resp = null;
		Set<Student> listStudent = service.getAllStudent();
		if (listStudent == null || listStudent.isEmpty()) {
			String msg = "No Data Found";
			resp = new ResponseEntity<String>(msg, HttpStatus.OK);

			return resp;
		}
		resp = new ResponseEntity<Set<Student>>(listStudent, HttpStatus.OK);
		return resp;
	}

	@DeleteMapping("/remove/{id}")
	public <T> ResponseEntity<T> deleteId(@PathVariable int id) {
		ResponseEntity<T> resp = null;
		boolean deleteId = service.deleteStudent(id);
		if (deleteId) {
			resp = new ResponseEntity<T>((T) "Id Deleted Sucessfully", HttpStatus.OK);
			return resp;
		}
		resp = new ResponseEntity<T>((T) "Id Deleted Failed ", HttpStatus.BAD_REQUEST);
		return resp;
	}
}
