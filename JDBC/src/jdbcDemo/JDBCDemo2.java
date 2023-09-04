package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import DbConnection.DBConnection;

public class JDBCDemo2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Name");
	String name1=sc.next();
	
	System.out.println("Enter email");
	String email1=sc.next();
	
	System.out.println("Enter Password");
	String password1=sc.next();
	
	System.out.println("Enter Gender");
	String gender1=sc.next();
	
	System.out.println("Enter city");
	String city1=sc.next();
	try {
		/*
		DBConnection obj = new DBConnection(); Everytime we have t create object which is not good programming
		//so make method static so t can called directly from class name. 
		Connection con=obj.getConnection();
		*/
		Connection con=DBConnection.getConnection();
		
		
		/*Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_demo_db","root","1234");
		*/
		PreparedStatement ps=con.prepareCall("insert into register values(?,?,?,?,?)");
		ps.setString(1,name1);
		ps.setString(2,email1);
		ps.setString(3,password1);
		ps.setString(4,gender1);
		ps.setString(5,city1);
		
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("Success");
		}
		else {
			System.out.println("fail");
		}
		
	}catch(Exception e) {
		
	}
	}
}
