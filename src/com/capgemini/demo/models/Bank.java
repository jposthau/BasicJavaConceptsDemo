package com.capgemini.demo.models;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts = new ArrayList<Account>();
	
	public void addAccount(Account...accs) {
		for(Account acc : accs) {
			this.accounts.add(acc);
		}
	}
	
	public void removeAccount(Account acc) {
		accounts.remove(acc);
	}
	
	public void listAccounts() {
		for(Account acc:accounts) {
			System.out.println(acc.toString());
		}
		System.out.println();
	}

}
