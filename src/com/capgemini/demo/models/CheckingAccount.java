package com.capgemini.demo.models;

import com.capgemini.demo.interfaces.AccountInterface;

public class CheckingAccount extends Account implements AccountInterface{
	
	public static final String ACC_NUM_PRE = "CA";
	private static int accNum = 0;
	private String accountNumber;

	{
		genAccountNumber();
	}
	
	public CheckingAccount() {
		super();
		super.setAccountNumber(this.accountNumber);
	}
	
	public CheckingAccount(double bal) {
		super(bal);
		super.setAccountNumber(this.accountNumber);
	}
	
	public void genAccountNumber() {
		this.accountNumber = ACC_NUM_PRE + accNum;
		accNum++;
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
}
