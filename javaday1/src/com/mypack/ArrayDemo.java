package com.mypack;

public class ArrayDemo {
	static int[] localData() {
		return new int[] {10,20,30};
	}
public static void main(String[] args) {
	int arr[]=localData();
		//int[] data= new int[10];
		/*data[0]=10;
		data[1]=20;
		data[2]=30;
		data[3]=40;*/
		//int data[]= {1,2,3,4,5,6,7,8,9,10};
		/*
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}*/
		for(int mydata:arr) {
			System.out.println(mydata);
		}
	}
}
