package com.service;

import java.util.List;

import com.model.Student;

public interface StudentService {
	
	
	boolean addStudent(Student s);
	boolean deleteStudent(int id);
	boolean updateStudent(Student s);
	Student getStudentById(int id);
	List<Student> getAllStudent();
	List<Student> searchStudent(String data);

}
