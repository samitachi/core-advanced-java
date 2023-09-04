package in.sp.oldapproach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StoreEmpDetails {
public void storeDetails(String name,String email,int Salary)
{
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1_db","root","1234");
		PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?)");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setInt(3, Salary);

	int i =ps.executeUpdate();
	if(i>0) {
		System.out.println("Success");
	}
	else {
		System.out.println("Fail");
	}
	}
	
	catch(Exception e) {
		e.printStackTrace();
	}
	}
}
