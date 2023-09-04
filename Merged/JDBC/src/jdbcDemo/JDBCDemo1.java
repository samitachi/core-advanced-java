package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo1 {
public static void main(String[] args) {
	try {
		//1.Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Success");
		//2. Create database Connection
		String url = "jdbc:mysql://localhost:3306/my_demo_db";
        String username = "root";
        String password = "1234";

        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Success");
        //3. create statement
        Statement st = con.createStatement();
        //4.get values from resultset
        ResultSet rs=st.executeQuery("select * from register");
        
        //5.get values from resultset
        while(rs.next()) {
        	String name1=rs.getString("name");
        	String email1=rs.getString("email");
        	String gender1=rs.getString("gender");
        	String city1=rs.getString("city");
        	
        	System.out.println(name1+"--"+email1+"--"+gender1+"--"+city1);
        }
        rs.close();
        st.close();
        con.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
