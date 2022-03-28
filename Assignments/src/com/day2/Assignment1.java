package com.day2;

public class Assignment1 {

	public static void main(String argd[]) {
		//boolean bool=true;
		for(int i=0;i<5;i++) {
			for(int j=0;j<10;j++) {
				System.out.println(j+"\t");
				if(j>5) {
					//break;
					System.out.println();
					continue;
				}
			}
			System.out.println("Outer loop");
		}
		System.out.println("end");
	}
}
