package com.day2;

public class Student {
	private int stuRollNo; 
	private String stuName;
	private String email;
	private String subject;
	
	public int getStuRollNo() {
		return stuRollNo;
	}

	public void setStuRollNo(int stuRollNo) {
		this.stuRollNo = stuRollNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void displayStudent() {
		System.out.println(stuRollNo+" "+stuName);
	}
}
