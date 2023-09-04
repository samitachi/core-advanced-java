package in.sp.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static Connection con;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1/demo1_db", "root", "1234");
			// In more good programming these are put inside properties file
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnection() {
		return con;
	}
}
