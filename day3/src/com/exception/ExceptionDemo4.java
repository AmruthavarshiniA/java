package com.exception;

public class ExceptionDemo4 {

	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("person is not eligible to vote");
		}
		else {
			System.out.println("person is eligible to vote");			
		}
	}
	public static void main(String[] args) {
		validate(13);
		System.out.println("rest of the code....");
	}
}
