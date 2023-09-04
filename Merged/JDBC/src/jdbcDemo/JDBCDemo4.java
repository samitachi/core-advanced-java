package jdbcDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import DbConnection.DBConnection;

public class JDBCDemo4 {
      public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter Emaail");
    	  String email1=sc.next();
		try {
			Connection con= DBConnection.getConnection();
			PreparedStatement ps =con.prepareStatement("delete from register where email=?");
			ps.setString(1,email1);
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println("Success");
			}
			else {
				System.out.println("Fail");
			}
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
