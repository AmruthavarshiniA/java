package com.day2;

public class CourseManagement {

	/*public static void main(String[] args) {
		
		Student student=new Student();
		student.setStudentId(101);
		student.setStudentType('F');
		
		System.out.println("student id: "+student.getStudentId()+" Student type:"+student.getStudentType());
	}*/
	public static void main(String[] args) {
		StudentC student=new StudentC(10,'F');
		System.out.println("student id: "+student.getStudentId()+" Student type:"+student.getStudentType());
	}
}
