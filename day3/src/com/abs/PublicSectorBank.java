package com.abs;

public class PublicSectorBank extends Bank {

	@Override
	public void checkBalance() {
		System.out.println("public sector balance");
		
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
