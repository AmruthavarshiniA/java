package com.inter;

public class BankMain {

	public static void main(String[] args) {
		
		PublicSectorBank pb=new PublicSectorBank();
		pb.checkBalance();
		pb.deposite();
		pb.sellInsurance();
		pb.settleClaims();
		pb.buyFunds();
		pb.sellFunds();
	}	
}
