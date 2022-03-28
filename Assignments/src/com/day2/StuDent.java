package com.day2;

public class StuDent {

	private static int studentId=550;
	private String studentName;
	private String firstName;
	private String lastName;
	private char studentType;

	public StuDent() {
		studentId=studentId+1;
	}

	public StuDent(char studentType,String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentType = studentType;
	}
	public void display() {
		studentName=firstName+lastName;
		System.out.println(studentId+" "+studentType+" "+studentName);
	}
	
	
}
