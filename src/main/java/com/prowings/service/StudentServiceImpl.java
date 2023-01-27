package com.prowings.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prowings.dao.StudentDao;
import com.prowings.dao.StudentDaoImpl;
import com.prowings.model.Candidate;
import com.prowings.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDao dao;
	@Autowired
	DozerBeanMapper mapper;
	
	@Override
	public Student getStudentById(int id) {
		Optional<Candidate> cnd = dao.findById(id);
		Student std = new Student();
		if(cnd.isPresent())
		{
//			std.setRoll(cnd.get().getRoll());
//			std.setName(cnd.get().getName());
//			std.setAddress(cnd.get().getAddress());
			
			mapper.map(cnd.get(), std);
		}

		if(cnd.isEmpty())
			throw new NoSuchElementException("No record present with this id!!");
		else
		return std;
	}

//	@Override
//	public List<Student> getStudents() {
//		return dao.findAll();
//	}

	@Override
	public Student saveStudent(Candidate student) {
		Student storedStudent = new Student();
		mapper.map(dao.save(student), storedStudent);
		return storedStudent;
	}

//	@Override
//	public Student updateStudent(Student student) {
//		return dao.save(student);
//	}

//	@Override
//	public void deleteStudentById(int id) {
//		dao.deleteById(id);
//	}
}
