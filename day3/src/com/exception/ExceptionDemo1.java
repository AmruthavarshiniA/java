package com.exception;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		try {
			int data=10/0;
		}
		catch(ArithmeticException e) {
			//System.out.println(e);
			System.out.println("dont divide by zero");
		}
	}
}
