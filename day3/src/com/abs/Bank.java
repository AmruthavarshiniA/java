package com.abs;

public abstract class Bank {
	
	public abstract void checkBalance();
	public abstract void deposite();
	public abstract void withdraw();
	
	public void bisinessBanking() {
		System.out.println("default impl");
	}

}
