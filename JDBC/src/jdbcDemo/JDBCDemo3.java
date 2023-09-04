package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import DbConnection.DBConnection;

public class JDBCDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("name: ");
		String name1 = sc.next();

		System.out.println("Enter Email id: ");
		String email1 = sc.next();
		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement("Update register set name=? where email=?");) {

			ps.setString(1, name1);
			ps.setString(2, email1);
			int i = ps.executeUpdate();
			if (i > 0) {
				System.out.println("Successfully Updated");
			} else {
				System.out.println("Unable to update!!");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
