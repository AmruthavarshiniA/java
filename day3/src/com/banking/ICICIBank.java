package com.banking;

public class ICICIBank implements Banking {

	@Override
	public String withdraw(int amt) {
		return "amount withdrawn from ICIC account:"+amt;
	}

	@Override
	public String deposite(int amt) {
		return "amount deposited to ICICI account:"+amt;
	}

	@Override
	public String checkbalance() {
		return "available balance in ICICI account:";
	}

}