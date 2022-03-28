package com.miniapp;

public class Guest {

	public static void main(String[] args) {
		
		FrontdeskService fds=new FrontdeskService(new ItalianRestaurant());
		System.out.println(fds.takeOrder(" pasta"));
		
		FrontdeskService fds1=new FrontdeskService(new JapneseRestaurant());
		System.out.println(fds1.takeOrder(" Tempura"));
		
		FrontdeskService fds2=new FrontdeskService(new IndianRestaurant());
		System.out.println(fds2.takeOrder(" palav"));
		
		FrontdeskService fds3=new FrontdeskService(new AmericanRestaurant());
		System.out.println(fds3.takeOrder(" burger"));
		
	}
}
