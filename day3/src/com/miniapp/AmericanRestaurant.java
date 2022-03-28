package com.miniapp;

public class AmericanRestaurant implements Restaurant{

	@Override
	public String prepareFood(String dishName) {
		return "preparing "+dishName+" in american style";
	}

}
