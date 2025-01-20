// BankAccount class representing a bank account with different access modifiers
public class BankAccount {
    // Public attribute: Accessible from anywhere
    public long accountNumber;

    // Protected attribute: Accessible within the same package and subclasses
    protected String accountHolder;

    // Private attribute: Accessible only within this class
    private double balance;

    // Constructor to initialize bank account details
    public BankAccount(long accountNumber, String accountHolder, double balance) {
        // Assigning values to instance variables
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to deposit money into the account
    public void deposit(double amount) {
        // Checking if deposit amount is valid
        if (amount > 0) {
            // Adding the deposit amount to the balance
            balance += amount;

            // Printing success message
            System.out.println("Successfully deposited: $" + amount);
        } else {
            // Printing error message for invalid deposit amount
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    // Public method to withdraw money from the account
    public void withdraw(double amount) {
        // Checking if withdrawal amount is valid
        if (amount > 0) {
            // Checking if sufficient balance is available
            if (balance >= amount) {
                // Deducting the withdrawal amount from the balance
                balance -= amount;

                // Printing success message
                System.out.println("Successfully withdrawn: $" + amount);
            } else {
                // Printing error message for insufficient balance
                System.out.println("Insufficient balance. Unable to process withdrawal.");
            }
        } else {
            // Printing error message for invalid withdrawal amount
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        }
    }

    // Public method to get the current balance
    public double getBalance() {
        // Returning the balance amount
        return balance;
    }

    // Public method to display account details
    public void displayAccountDetails() {
        // Printing account number
        System.out.println("Account Number: " + accountNumber);

        // Printing account holder name
        System.out.println("Account Holder: " + accountHolder);

        // Printing current balance
        System.out.println("Current Balance: " + balance);
    }
}

// Subclass SavingsAccount demonstrating access to public and protected members
class SavingsAccount extends BankAccount {
    // Constructor for SavingsAccount calling the superclass constructor
    public SavingsAccount(long accountNumber, String accountHolder, double balance) {
        // Calling parent class constructor to initialize attributes
        super(accountNumber, accountHolder, balance);
    }

    // Method to display savings account details
    public void displaySavingsAccountDetails() {
        // Accessing public accountNumber
        System.out.println("Savings Account Number: " + accountNumber);

        // Accessing protected accountHolder
        System.out.println("Savings Account Holder: " + accountHolder);
    }
}

// Main class to test BankAccount and SavingsAccount
class BankSystem {
    public static void main(String[] args) {
        // Creating a SavingsAccount object with account details
        SavingsAccount account = new SavingsAccount(987654321, "Abhishek", 5000.0);

        // Displaying account details
        account.displaySavingsAccountDetails();

        // Depositing money into the account
        account.deposit(2000.0);

        // Withdrawing money from the account
        account.withdraw(1500.0);

        // Printing the updated balance
        System.out.println("Updated Balance: " + account.getBalance());

        // Displaying complete account details
        account.displayAccountDetails();
    }
}
