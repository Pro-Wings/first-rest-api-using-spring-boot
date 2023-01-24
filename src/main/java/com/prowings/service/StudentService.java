package com.prowings.service;

import java.util.List;

import com.prowings.model.Student;

public interface StudentService {
	
	public Student getStudentById(int id);

	public List<Student> getStudents();
	
	public Student saveStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public void deleteStudentById(int id);
	
	

}
