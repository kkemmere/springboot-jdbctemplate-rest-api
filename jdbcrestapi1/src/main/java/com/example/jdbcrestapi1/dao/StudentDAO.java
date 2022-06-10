package com.example.jdbcrestapi1.dao;

import java.util.List;

import com.example.jdbcrestapi1.model.Student;

public interface StudentDAO {
	
	// 5 generic methods
	int save(Student student);
	
	int update(Student student, int id);
	
	int delete(int id);
	
	List<Student> getAll();
	
	Student getById(int id);

}
