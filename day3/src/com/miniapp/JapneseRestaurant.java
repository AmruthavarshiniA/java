package com.miniapp;

public class JapneseRestaurant implements Restaurant{

	@Override
	public String prepareFood(String dishName) {
		return "preparing "+dishName;
	}

}
