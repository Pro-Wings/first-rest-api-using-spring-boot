package com.prowings.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prowings.model.Candidate;
import com.prowings.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Candidate, Integer>{

	
}
