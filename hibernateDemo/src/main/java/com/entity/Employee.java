package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int empid;
	private String empName;
	private String city;
	
	public Employee() {
		super();
	}

	public Employee(int empid, String empName, String city) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee[empid="+empid+",empName="+empName+",city="+city+"]";
	}

	public int getEmpid() {
		return empid;
	}

	public String getEmpName() {
		return empName;
	}

	public String getCity() {
		return city;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setCity(String city) {
		this.city = city;
	}


}
