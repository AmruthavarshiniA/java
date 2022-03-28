package com.task5;

public class AppMain {
public static void main(String[] args) {
	User user=new User();
	
	if(user != null) {
	    Address address = user.getAddress();
	    if(address != null && address.getCountry().equalsIgnoreCase("India")) {
		    System.out.println("User belongs to India");
	    	}
		}
	}
}
