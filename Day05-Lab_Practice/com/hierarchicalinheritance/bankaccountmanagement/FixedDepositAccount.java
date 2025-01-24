package com.hierarchicalinheritance.bankaccountmanagement;

// Subclass representing a fixed deposit account
class FixedDepositAccount extends BankAccount
{
	// Maturity period in months for the fixed deposit
	private int maturityPeriod;

	// Constructor to initialize fixed deposit details
	public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod)
	{
		// Calling parent constructor to initialize common attributes
		super(accountNumber, balance);
		// Assigning maturity period
		this.maturityPeriod = maturityPeriod;
	}

	// Overriding method to specify account type
	@Override
	public String getAccountType()
	{
		// Returning fixed deposit account type
		return "Fixed Deposit Account";
	}

	// Method to display FixedDepositAccount account details
	public void displayAccountDetails()
	{
		// Printing FixedDepositAccount account details
		System.out.println("\nAccount Number: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Type: " + getAccountType());
		System.out.println("Maturity Period: " + maturityPeriod + " Months");
	}
}