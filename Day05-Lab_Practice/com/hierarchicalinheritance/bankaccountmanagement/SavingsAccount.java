package com.hierarchicalinheritance.bankaccountmanagement;

// Subclass representing a savings account
class SavingsAccount extends BankAccount
{
	// Interest rate applicable to the savings account
	private double interestRate;

	// Constructor to initialize savings account details
	public SavingsAccount(String accountNumber, double balance, double interestRate)
	{
		// Calling parent constructor to initialize common attributes
		super(accountNumber, balance);
		// Assigning interest rate
		this.interestRate = interestRate;
	}

	// Overriding method to specify account type
	@Override
	public String getAccountType()
	{
		// Returning savings account type
		return "Savings Account";
	}

	// Method to calculate and add interest to balance
	public void applyInterest()
	{
		// Calculating interest and adding to balance
		balance += (balance * interestRate / 100);
	}

	// Method to display savings account details
	public void displayAccountDetails()
	{
		// Printing savings account details
		System.out.println("\nAccount Number: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Type: " + getAccountType());
		System.out.println("Interest Rate: " + interestRate);
	}
}

