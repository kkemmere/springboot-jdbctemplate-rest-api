package com.example.jdbcrestapi1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	private int ID;
	
	private String name;
	
	private String dept_name;
	
	private int tot_cred;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public int getTot_cred() {
		return tot_cred;
	}

	public void setTot_cred(int tot_cred) {
		this.tot_cred = tot_cred;
	}
	

}
