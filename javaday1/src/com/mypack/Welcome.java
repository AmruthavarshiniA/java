package com.mypack;

public class Welcome {
	public static void main(String[] args) {	
		//System.out.println("welcome " + args[0]+" in "+ args[1]);
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		int c=a+b;
		System.out.println("addition is:"+c);
	}
}
