package BankFunctionalities;

import java.util.Scanner;

class Bank {
	private String accountHolderName;
	private long accountNumber;
	private double accountBalence;

	Bank(String accountHolderName, long accountNumber, double accountBalence) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.accountBalence = accountBalence;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalence() {
		return accountBalence;
	}

	public void setAccountBalence(double accountBalence) {
		this.accountBalence = accountBalence;
	}

	double Debit(double amount) {
		if (amount > getAccountBalence()) {
			System.out.println("Insuffisient Balance!");
		}

		return accountBalence = getAccountBalence() - amount;

	}

	double Credit(double amount) {

		return accountBalence = getAccountBalence() + amount;

	}

	void CreditAmountDetails() {
		System.out.println("---------Transaction Details--------");
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Account Creditted");
		System.out.println("Total Amount: " + accountBalence);
	}

	void DebitAmountDetails() {
		System.out.println("---------Transaction Details--------");
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Account debited");
		System.out.println("Total Amount: " + accountBalence);
	}

}

class Icici extends Bank {
	Icici(String accountHolderName, long accountNumber, double accountBalance) {
		super(accountHolderName, accountNumber, accountBalance);
	}
}

class Hdfc extends Bank {
	Hdfc(String accountHolderName, long accountNumber, double accountBalance) {
		super(accountHolderName, accountNumber, accountBalance);
	}
}

class Idbi extends Bank {
	Idbi(String accountHolderName, long accountNumber, double accountBalance) {
		super(accountHolderName, accountNumber, accountBalance);
	}
}

public class BankAppFunctions {

	public static void main(String[] args) {
		double accountBalence = 0.0;
		boolean isRunning = true;
		while (isRunning) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Bank Code: 1 for ICICI; 2 for HDFC; 3 for IDBI; 0 to Exit");
			int bankCode = sc.nextInt();

			if (bankCode == 0) {
				System.out.println("Exiting the application. Thank you!");
				isRunning = false;
				continue;
			}
			sc.nextLine();
			System.out.println("Enter your Name");
			String accountHolderName = sc.nextLine();
			System.out.println("Enter your Account Number");
			long accountNumber = sc.nextLong();

			System.out.println("To Credit type 1 and To Debit type 2 ");
			int transactionCode = sc.nextInt();
			System.out.println("Enter Amount");
			double amt = sc.nextDouble();

			switch (bankCode) {
			case 1:
				Icici I1 = new Icici(accountHolderName, accountNumber, accountBalence);
				switch (transactionCode) {
				case 1:
					I1.Credit(amt);
					I1.CreditAmountDetails();
					break;
				case 2:
					I1.Debit(amt);
					I1.DebitAmountDetails();
					break;
				}
				accountBalence = I1.getAccountBalence();
				break;
			case 2:
				Hdfc I2 = new Hdfc(accountHolderName, accountNumber, accountBalence);
				switch (transactionCode) {
				case 1:
					I2.Credit(amt);
					I2.CreditAmountDetails();
					break;
				case 2:
					I2.Debit(amt);
					I2.DebitAmountDetails();
					break;
				}
				accountBalence = I2.getAccountBalence();
				break;
			case 3:
				Idbi I3 = new Idbi(accountHolderName, accountNumber, accountBalence);
				switch (transactionCode) {
				case 1:
					I3.Credit(amt);
					I3.CreditAmountDetails();
					break;
				case 2:
					I3.Debit(amt);
					I3.DebitAmountDetails();
					break;
				}
				accountBalence = I3.getAccountBalence();
				break;
			default:
				System.out.println("Thank you for banking with us");
				break;
			}

		}

	}
}
