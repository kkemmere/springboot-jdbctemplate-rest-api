package com.example.jdbcrestapi1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jdbcrestapi1.dao.StudentDAO;
import com.example.jdbcrestapi1.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	private StudentDAO sDAO;
	
	// Handler method for getting all students
	@GetMapping("/students")
	public List<Student> getStudent()
	{
		return sDAO.getAll();
	}

	// Handler method for getting only 1 student by id
	@GetMapping("/students/{id}")
	public Student getStudentByID(@PathVariable int id)
	{
		return sDAO.getById(id);
	}
	
	// Handler method to post new student in university database student table
	@PostMapping("/students")
	public String saveStudent(@RequestBody Student student)
	{
		return sDAO.save(student)+" No. of rows saved to DB";
	}
	
	// Handler method to update student in university database
	@PutMapping("/students/{id}")
	public String updateStudent(@RequestBody Student student, @PathVariable int id) {
		return sDAO.update(student, id)+" No. of rows updated to the DB";
	}
	
	
	// Handler method to delete student in university database
	@DeleteMapping("/students/{id}")
	public String deleteStudentByID(@PathVariable int id) {
		return sDAO.delete(id)+" No. of rows deleted from the database";
	}
}
