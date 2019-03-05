package com.chainsys.controller;

public class Department {
	public int id;
	public String department_name;
	public String hod;
	public int getDepartment_id() {
		return id;
	}
	public void setDepartment_id(int department_id) {
		this.id = department_id;
	}
	public String getName() {
		return department_name;
	}
	public void setName(String department_name) {
		this.department_name = department_name;
	}
	public String getHod() {
		return hod;
	}
	public void setHod(String hod) {
		this.hod = hod;
	}
	

}
