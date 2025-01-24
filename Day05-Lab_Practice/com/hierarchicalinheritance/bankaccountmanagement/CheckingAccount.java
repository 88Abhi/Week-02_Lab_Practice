package com.hierarchicalinheritance.bankaccountmanagement;

// Subclass representing a checking account
class CheckingAccount extends BankAccount
{
	// Withdrawal limit for the checking account
	private double withdrawalLimit;

	// Constructor to initialize checking account details
	public CheckingAccount(String accountNumber, double balance, double withdrawalLimit)
	{
		// Calling parent constructor to initialize common attributes
		super(accountNumber, balance);
		// Initializing values to instance variables
		this.withdrawalLimit = withdrawalLimit;
	}

	// Overriding method to specify account type
	@Override
	public String getAccountType()
	{
		// Returning checking account type
		return "Checking Account";
	}

	// Method to display CheckingAccount account details
	public void displayAccountDetails()
	{
		// Printing CheckingAccount account details
		System.out.println("\nAccount Number: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Type: " + getAccountType());
		System.out.println("Withdrawal Limit: " + withdrawalLimit);
	}
}
