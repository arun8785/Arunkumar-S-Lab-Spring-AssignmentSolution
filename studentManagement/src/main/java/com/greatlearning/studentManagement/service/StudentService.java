package com.greatlearning.studentManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.studentManagement.entity.Student;

@Service
public interface StudentService {
	
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student theStudent);

	public void deleteById(int theId);

}
