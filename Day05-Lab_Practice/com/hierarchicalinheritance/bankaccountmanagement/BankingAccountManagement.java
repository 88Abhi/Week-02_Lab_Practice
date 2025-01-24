package com.hierarchicalinheritance.bankaccountmanagement;

// BankingAccountManagement class to test banking system
public class BankingAccountManagement
{
	public static void main(String[] args)
	{
		// Creating an instance of SavingsAccount with interest rate
		SavingsAccount savings = new SavingsAccount("SA123", 5000, 5);

		// Displaying savings account details
		savings.displayAccountDetails();

		// Creating an instance of FixedDepositAccount
		FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FD123", 10000, 10);

		// Displaying FixedDepositAccount account details
		fixedDepositAccount.displayAccountDetails();

		// Creating an instance of CheckingAccount
		CheckingAccount checkingAccount = new CheckingAccount("CA123", 8000, 5000);

		// Displaying CheckingAccount account details
		checkingAccount.displayAccountDetails();
	}
}
