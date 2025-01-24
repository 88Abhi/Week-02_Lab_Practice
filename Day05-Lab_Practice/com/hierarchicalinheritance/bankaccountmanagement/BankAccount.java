package com.hierarchicalinheritance.bankaccountmanagement;

// Base class representing a generic bank account
class BankAccount
{
	// Account number of the bank account
	protected String accountNumber;

	// Current balance in the account
	protected double balance;

	// Constructor to initialize account details
	public BankAccount(String accountNumber, double balance)
	{
		// Initializing values to instance variables
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// Method to deposit money into the account
	public void deposit(double amount)
	{
		// Adding amount to the balance
		balance += amount;
	}

	// Method to return account type (to be overridden)
	public String getAccountType()
	{
		// Returning generic account type
		return "Generic Bank Account";
	}

	// Method to be overridden in subclasses
	public void displayAccountDetails()
	{
		System.out.println("Generic Bank Account");
	}
}
