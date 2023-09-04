package DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection  {
       public static Connection getConnection()throws ClassNotFoundException,SQLException {
        	Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_demo_db","root","1234");
        	
			/*
        	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_demo_db","root","1234");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		*/
    	return con;
	}
	}

