// BankAccount class to manage account details
public class BankAccount {

    // Static variable shared across all bank accounts
    static String bankName = "State Bank";

    // Final variable for account number
    final int accountNumber;

    // Instance variables for account holder's details
    String accountHolderName;

    // Static variable to keep track of total number of accounts
    static int totalAccounts = 0;

    // Constructor to initialize account details
    public BankAccount(String accountHolderName, int accountNumber) {
        // Initializing account holder's name using 'this' keyword
        this.accountHolderName = accountHolderName;

        // Initializing account number using 'this' keyword
        this.accountNumber = accountNumber;

        // Increment total accounts every time a new account is created
        totalAccounts++;
    }

    // Static method to display the total number of accounts
    public static void getTotalAccounts() {
        // Displaying the total number of bank accounts created
        System.out.println("Total Accounts in " + bankName + ": " + totalAccounts);
    }

    // Instance method to display account details
    public void displayAccountDetails() {
            // Displaying bank details
            System.out.println("Bank: " + bankName);

            // Displaying account holder's name
            System.out.println("Account Holder: " + accountHolderName);

            // Displaying account number
            System.out.println("Account Number: " + accountNumber);
    }

    public static void main(String[] args) {
        // Creating a bank account object
        BankAccount account = new BankAccount("Abhishek Jat", 101);

        // Checking if the current object is an instance of the BankAccount class
        if (account instanceof BankAccount) {
            // Displaying details of the first account
            account.displayAccountDetails();
        }
        // Displaying the total number of bank accounts created
        getTotalAccounts();
    }
}
