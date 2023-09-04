package Main;

import java.util.Scanner;

import Admin.AdminPanel;

public class Main {
	
	public void startBankApp() { //we are calling this method in other package so we have to make it public
		System.out.println("choose one option below:-\r\n"
				+"1.Admin Login\r\n"
				+"2.Customer Login\r\n"
				+"3.exit");
		
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		
		if(i==1) {
			AdminPanel ap =new AdminPanel();
			ap.loginAdmin();
		}
		else if(i==2) {
			
		}
		else if(i==3) {
			System.exit(0);
		}
		else {
			System.err.println("----------Invalid Input-------");
			startBankApp();
		}
	}
  public static void main(String[] args) {
	System.out.println("---------------Welcome to SP Bank------------");
  //Main m=new Main();
	//m.startBankApp();
	new Main().startBankApp();
	}
}
