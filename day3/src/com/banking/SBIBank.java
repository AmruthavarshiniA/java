package com.banking;

public class SBIBank implements Banking {

	@Override
	public String withdraw(int amt) {
		return "amount withdrawn from SBI account:"+amt;
	}

	@Override
	public String deposite(int amt) {		
		return "amount deposited to SBI account:"+amt;
	}

	@Override
	public String checkbalance() {
		return "available balance in SBI account:";
	}

}