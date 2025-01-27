package com.bankingsystem;

// BankingSystem class to test the banking system
public class BankingSystem {

	public static void main(String[] args) {
		// Create a savings account with details account number, holder's name, and balance
		SavingsAccount savingsAccount = new SavingsAccount("SA12345", "Abhishek", 5000.0);

		// Create a current account with details account number, holder's name, and balance
		CurrentAccount currentAccount = new CurrentAccount("CA67890", "Amit", 10000.0);

		// Display details of the savings account
		System.out.println("Savings Account Details:");
		System.out.println("Account Number: " + savingsAccount.getAccountNumber());
		System.out.println("Holder Name: " + savingsAccount.getHolderName());
		System.out.println("Balance: " + savingsAccount.getBalance());
		System.out.println("Calculated Interest: " + savingsAccount.calculateInterest());

		// Deposit money into the savings account
		savingsAccount.deposit(2000);

		// Withdraw money from the savings account
		savingsAccount.withdraw(1000);

		// Display loan eligibility for the savings account
		System.out.println("Loan Eligibility: " + savingsAccount.calculateLoanEligibility());

		// Apply for a loan in the savings account
		savingsAccount.applyForLoan(1500);

		// Display details of the current account
		System.out.println("\nCurrent Account Details:");
		System.out.println("Account Number: " + currentAccount.getAccountNumber());
		System.out.println("Holder Name: " + currentAccount.getHolderName());
		System.out.println("Balance: " + currentAccount.getBalance());
		System.out.println("Calculated Interest: " + currentAccount.calculateInterest());

		// Deposit money into the current account
		currentAccount.deposit(5000);

		// Withdraw money from the current account
		currentAccount.withdraw(3000);

		// Display loan eligibility for the current account
		System.out.println("Loan Eligibility: " + currentAccount.calculateLoanEligibility());

		// Apply for a loan in the current account
		currentAccount.applyForLoan(5000);
	}
}