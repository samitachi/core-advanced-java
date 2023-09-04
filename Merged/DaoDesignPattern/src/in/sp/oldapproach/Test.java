package in.sp.oldapproach;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	System.out.println("-------------Welcme to smart programming---------");
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Employee name: ");
	String name1=sc.next();
	System.out.println("Enter employee ID: ");
	String id1=sc.next();
	System.out.println("Enter Salary: ");
	int salary=sc.nextInt();
	
	new StoreEmpDetails().storeDetails(name1, id1, salary);
}
}
//This will work but it is not a good way of programming, here data acquirization logic is written with buiseness lgic.They have to be seperate 
