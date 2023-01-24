package com.prowings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prowings.dao.StudentDao;
import com.prowings.dao.StudentDaoImpl;
import com.prowings.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDao dao;
	
	@Override
	public Student getStudentById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Student> getStudents() {
		return dao.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return dao.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return dao.save(student);
	}

	@Override
	public void deleteStudentById(int id) {
		dao.deleteById(id);
	}
}
