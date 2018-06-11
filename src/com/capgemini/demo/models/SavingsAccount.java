package com.capgemini.demo.models;

import com.capgemini.demo.interfaces.AccountInterface;

public class SavingsAccount extends Account implements AccountInterface{

	public static final String ACC_NUM_PRE = "SA";
	private static int accNum = 0;
	private String accountNumber;
	
	{
		genAccountNumber();
	}

	public SavingsAccount() {
		super();
		super.setAccountNumber(this.accountNumber);
	}
	
	public SavingsAccount(double bal) {
		super(bal);
		super.setAccountNumber(this.accountNumber);
	}
	
	public void genAccountNumber() {
		this.accountNumber = ACC_NUM_PRE + accNum;
		accNum++;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

}
