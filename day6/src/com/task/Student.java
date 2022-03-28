package com.task;

public class Student {

	int roolNo;
	String subject;
	String name;
	String city;
	
	@Override
	public String toString() {
		return "Student [roolNo:"+roolNo+",subject:"+subject+",name:"+name+",city:"+city+"]";
	}

	public int getRoolNo() {
		return roolNo;
	}

	public String getSubject() {
		return subject;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public void setRoolNo(int roolNo) {
		this.roolNo = roolNo;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student(int roolNo, String subject, String name, String city) {
		super();
		this.roolNo = roolNo;
		this.subject = subject;
		this.name = name;
		this.city = city;
	}
}
