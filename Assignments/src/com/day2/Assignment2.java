package com.day2;

public class Assignment2 {

	public static void main(String[] args) {
		char grade='B';
		int s=0;
		int e=0;
		
		switch (grade) {
		case 'A':
			s=80;
			e=100;
			break;
			
		case 'B':
			s=73;
			e=79;
			break;

		case 'C':
			s=65;
			e=72;
			break;
			
		case 'D':
			s=55;
			e=64;
			break;
			
		case 'E':
			s=0;
			e=55;
			break;
			
		default:
			System.out.println("Grade doesn't exists");
			break;
		}
		
		System.out.println(s+"-"+e);
		
	}
}
