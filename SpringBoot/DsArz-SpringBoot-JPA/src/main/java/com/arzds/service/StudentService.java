package com.arzds.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.arzds.model.Student;

@Service
public class StudentService {
	private static Set<Student> studentSet = new HashSet<>();

	public boolean save(Student student) {
		studentSet.add(student);
		if (studentSet.isEmpty())
			return false;
		else
			return true;
	}

	public Set<Student> getAllStudent() {
		return studentSet;
	}

	public boolean deleteStudent(int id) {
		for (Student student : studentSet) {
			if (student.getId() == id) {
				studentSet.remove(student);
				return true;
			}
		}
		return false;
	}

	public boolean updateStudent(int id, Student student) {
		for (Student stu : studentSet) {
			if (stu.getId() == id) {
				if (student.getName() != null) {
					stu.setName(student.getName());
					studentSet.add(stu);
				}
				return true;
			}
		}
		return false;
	}
}
