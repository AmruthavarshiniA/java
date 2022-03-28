package com.task1;

public class Employee {

	private int id;
	private String name;
	private int income;
	private String department;
	
	public Employee(int id, String name, int income, String department) {
		super();
		this.id = id;
		this.name = name;
		this.income = income;
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [id="+id+",name="+name+",income="+income+",department="+department+"] ";
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getIncome() {
		return income;
	}
	public String getDepartment() {
		return department;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
