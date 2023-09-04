package Admin;

import java.util.Scanner;

import Main.Main;

public class AdminPanel {
	public void loginAdmin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email id: ");
		String email1 = sc.next();

		System.out.println("Enter admin passsword");
		String pass1 = sc.next();

		if (email1.equals("admin@gmail.com") && pass1.equals("admin123")) {
			welcomeAdmin();
		} else {
			System.err.println("----------Invalid Credentials---------");
			Main obj = new Main();
			obj.startBankApp();
		}
	}

	private void welcomeAdmin() {
		System.out
				.println("Choose one option below:-\r\n" + "1. open account\r\n" + "2.close Account\r\n" + "3.Logout");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		switch (i) {
		case 1:
			openAccount();
			break;
		case 2:
			closeAccount();
			break;
		case 3:
			adminLogout();
			break;
		default:
			System.out.println("-----Wrong codes---------");
			welcomeAdmin();

			break;
		}
	}

	private void openAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name: ");
		String cust_name = sc.next();
		cust_name=cust_name.substring(0,1).toUpperCase()+cust_name.substring(1).toLowerCase()o;

		System.out.println("Enter Customer Account Number: ");
		String cust_AccNo = sc.next();
		boolean acctno_status;
		do {
			acctno_status =false;
			if(cust_AccNo.length() != 10) {
				System.err.println("----Invalid Account No. (Acc No should be of 10 digits-----");
				System.out.println("Enter Customer Account Number : ");
				cust_AccNo = sc.next();
				acctno_status=true;
			}
			else if(!cust_AccNo.startsWith("100100")) {
				System.err.println("----Invalid Account No. (Starts with 100100)---");
				System.out.println("Enter Customer Phone Number: ");
				String cust_PhnNo = sc.next();
				acctno_status=true;
			}
		}
		while(acctno_status);
			System.out.println("Enter Phone Number: ");
			String cust_PhnNo = sc.next();
            while (cust_PhnNo.length() != 10) {
			System.err.println("----Invalid Phone No. (Phn No should be of 10 digits-----");
			System.out.println("Enter Customer Phone Number : ");
			cust_PhnNo = sc.next();
		}

            System.out.println("Enter Amount ");
			int cust_amount = sc.nextInt();
		while (cust_amount < 5000) {
			System.err.println("-------------Amount should be Rs 5000 or more----------");
			System.out.println("Enter Amount: ");
			cust_amount = sc.nextInt();
		}

		String cust_pass=generatePassword(cust_name,cust_AccNo);
		
		boolean status = AdminDBOperations.openCustAccount(cust_name, cust_AccNo, cust_PhnNo, cust_amount, cust_pass);
		if(status) {
			System.out.println("--------Account Openned Successfully---------");
			welcomeAdmin();
		}
		else {
			System.err.println("------Error Occured------");
			welcomeAdmin();
		}
	}

	private String generatePassword(String name, String accountno) {

		String sub_name = name.substring(0, 3).toLowerCase();
		String sub_accno = accountno.substring(6, 10);
		String pass1 = sub_name + sub_accno;
		return pass1;
	}

	private void closeAccount() {

	}

	private void adminLogout() {
		Main m = new Main();
		m.startBankApp();
	}
}
