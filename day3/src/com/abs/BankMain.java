package com.abs;

public class BankMain {

	public static void main(String[] args) {
	
		Bank bank=new PublicSectorBank();
		bank.checkBalance();
		bank.deposite();
		bank.bisinessBanking();
		
		Bank bank1=new PrivateSectorBank();
		bank1.checkBalance();
		bank1.deposite();
		bank1.bisinessBanking();
		
	}
}
