package Bankaccountt;

public class BankAccount {
	    String accountNumber;
	    double balance;

	    // Constructor
	    BankAccount(String accNo, double bal) {
	        accountNumber = accNo;
	        balance = bal;
	    }

	    // Deposit method
	    public void deposit(double amount) {
	        if (amount <= 0) {
	            System.out.println("Invalid deposit amount");
	            return;
	        }

	        balance += amount;
	        System.out.println("Amount deposited: " + amount);
	    }

	    // Withdraw method
	    public void withdraw(double amount) {
	        if (amount <= 0 || amount > balance) {
	            System.out.println("Invalid withdrawal");
	            return;
	        }

	        balance -= amount;
	        System.out.println("Amount withdrawn: " + amount);
	    }

	    // Get balance method
	    public double getBalance() {
	        return balance;
	    }
	

	// Main class
	
	    public static void main(String[] args) {

	        BankAccount a = new BankAccount("123456", 5000);

	        System.out.println("Account Number: " + a.accountNumber);
	        System.out.println("Initial Balance: " + a.getBalance());

	        a.deposit(2000);
	        System.out.println("Balance after deposit: " + a.getBalance());

	        a.withdraw(1000);
	        System.out.println("Balance after withdrawal: " + a.getBalance());
	    }
	}