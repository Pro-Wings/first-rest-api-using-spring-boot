package com.prowings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.model.Student;
import com.prowings.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable("id") int id)
	{
		return service.getStudentById(id);
	}

	@GetMapping("/students")
	public List<Student> getStudents()
	{
		return service.getStudents();
	}
	
	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student student)
	{
		return service.saveStudent(student);
	}
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student)
	{
		return service.saveStudent(student);
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteStudentById(@PathVariable("id") int id)
	{
		service.deleteStudentById(id);
	}
	

}
