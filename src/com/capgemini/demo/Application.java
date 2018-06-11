package com.capgemini.demo;

import com.capgemini.demo.exceptions.NotEnoughFundsException;
import com.capgemini.demo.models.Bank;
import com.capgemini.demo.models.CheckingAccount;
import com.capgemini.demo.models.SavingsAccount;

public class Application {

	public static void main(String[] args) {

		CheckingAccount CA1 =  new CheckingAccount();
		SavingsAccount SA1 = new SavingsAccount(200.00);
		CheckingAccount CA2 = new CheckingAccount();
		SavingsAccount SA2 = new SavingsAccount(10.00);
		
		Bank bank = new Bank();
		bank.addAccount(CA1, CA2, SA1, SA2);
		
		bank.listAccounts();

		try {
			SA1.transfer(CA1, 50.00);
		} catch (NotEnoughFundsException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("\n============================================\n");
		}
		
		bank.listAccounts();
		
		try {
			SA1.transfer(CA2, 350.00);
		} catch (NotEnoughFundsException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("\n============================================\n");
		}
		
		bank.listAccounts();
		
		try {
			SA2.transfer(CA2, 100.00);
		} catch (NotEnoughFundsException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("\n============================================\n");
		}
		
		bank.listAccounts();
	}
}
