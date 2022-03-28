package com.abs;

public class PrivateSectorBank extends Bank{

	@Override
	public void checkBalance() {
		System.out.println("private sector balance");
		
	}

	@Override
	public void deposite() {
		System.out.println("public sector deposite");
		
	}

	@Override
	public void withdraw() {
		System.out.println("public sector withdraw");
		
	}

}
