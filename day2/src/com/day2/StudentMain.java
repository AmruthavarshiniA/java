package com.day2;

public class StudentMain {
	
	public static void main(String[] args) {
		//object1
		Student student=new Student();
		student.setStuRollNo(100);
		student.setStuName("Roopa");
		student.setEmail("roopa@xyz.com");
		student.setSubject("doing well in studies");
		
		student.displayStudent();
		System.out.println(student.hashCode());
		
		//object2
		Student student2=new Student();
		System.out.println(student2.hashCode());
		
		student2=student;
		System.out.println(student2.hashCode());
		
	}

}
