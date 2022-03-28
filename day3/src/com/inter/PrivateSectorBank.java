package com.inter;

public class PrivateSectorBank implements Bank,InsuranceService,MutualFunds{
	

	public void checkBalance() {
		System.out.println("private sector balance");
		
	}

	@Override
	public void deposite() {
		System.out.println("private sector deposite");
		
	}

	@Override
	public void withdraw() {
		System.out.println("private sector withdraw");
		
	}

	@Override
	public void sellInsurance() {
		System.out.println("private sector sell insurance");
		
	}

	@Override
	public void settleClaims() {
		System.out.println("private sector settle claims");
		
	}

	@Override
	public void sellFunds() {
		System.out.println("private sector sell funds");
		
	}

	@Override
	public void buyFunds() {
		System.out.println("private sector buy funds");
		
	}
}
