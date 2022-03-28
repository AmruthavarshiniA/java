package com.inter;

public class PublicSectorBank implements Bank,InsuranceService,MutualFunds{

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

	@Override
	public void sellInsurance() {
		System.out.println("public sector sell insurance");
		
	}

	@Override
	public void settleClaims() {
		System.out.println("public sector settle claims");
		
	}

	@Override
	public void sellFunds() {
		System.out.println("public sector sell funds");
		
	}

	@Override
	public void buyFunds() {
		System.out.println("public sector buy funds");
		
	}

}
