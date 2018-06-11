package com.capgemini.demo.models;

import com.capgemini.demo.exceptions.NotEnoughFundsException;
import com.capgemini.demo.interfaces.AccountInterface;

public abstract class Account implements AccountInterface{
	
	int accNum = 0;
	String accountNumber = "";
	public double bal = 0.00;
	
	public Account() {
		this.bal = 0.0;
	}
	
	public Account(double bal) {
		this.bal = bal;
	}
	
	public void deposit(double amount) {
		this.bal += amount;
	}
	
	public boolean withdrawal(double amount) {
		if(this.bal >= amount) {
			this.bal -= amount;
			return true;
		}
		return false;
	}
	
	public void transfer(Account account, double amount) throws NotEnoughFundsException{
		System.out.println("Transferring $" + amount + " from " +
				this.accountNumber + " to " + account.accountNumber);
		if(this.bal>=amount) {
			this.bal -= amount;
			account.bal += amount;
			System.out.println("Transfer successful.");
		}
		else {
			throw new NotEnoughFundsException("Transfer Failed!: Not enough funds available!");
		}
	}

	public String getAccountNum() {
		return accountNumber;
	}

	public void setAccountNumber(String accNum) {
		this.accountNumber = ""+accNum;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}
	
	public String toString() {
		return accountNumber + ": $" + bal;
	}

}
