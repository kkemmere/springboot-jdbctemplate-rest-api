package com.example.jdbcrestapi1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.jdbcrestapi1.model.Student;

@Repository
public class StudentDAOimpl implements StudentDAO {

	@Autowired
	JdbcTemplate jdbctemp;
	
	
	// Creates new student in DB (POST)
	@Override
	public int save(Student student) {
		return jdbctemp.update("INSERT INTO student (ID, name, dept_name, tot_cred) VALUES (?, ?, ?, ?)", new Object[] {student.getID(), student.getName(), student.getDept_name(), student.getTot_cred()});
	}

	// Update student information in DB (PUT)
	@Override
	public int update(Student student, int id) {
		return jdbctemp.update("UPDATE student SET ID=?, name=?, dept_name=?, tot_cred=? WHERE ID=?", new Object[] {student.getID(), student.getName(), student.getDept_name(), student.getTot_cred(), id});
	}

	// Delete student information from DB (DELETE)
	@Override
	public int delete(int id) {
		
		return jdbctemp.update("DELETE FROM student WHERE ID=?", id);
	}

	// Get all students from university database (GET)
	@Override
	public List<Student> getAll() {
		
		return jdbctemp.query("SELECT * FROM student", new BeanPropertyRowMapper<Student>(Student.class));
	}

	// Get 1 student from university database based on ID (GET)
	@Override
	public Student getById(int id) {
		
		return jdbctemp.queryForObject("SELECT * FROM student WHERE id=?", new BeanPropertyRowMapper<Student>(Student.class), id);
	}

}
