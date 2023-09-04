package in.sp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.sp.beans.Employee;
import in.sp.factory.ConnectionFactory;
//EmployeeServiceImpl will not be used to set data in the database EmployeeDaoImpl will be used 
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public boolean addEmpDetailsDao(Employee emp) {
		boolean status;
		try {
			// we have to make connection object but it is not a good practice to mention it here
			//so..
			Connection con = ConnectionFactory.getConnectionObj();
			PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?)");
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getEmail());
			ps.setInt(3,emp.getSalary());
			int i=ps.executeUpdate();
			if(i>0) {
				 status=true;
				
			}
			else {
				status=false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean updateEmpDetailsDao(Employee emp) {
		
		return false;
	}

	@Override
	public boolean deleteEmpDetailsDao(String email) {
		
		return false;
	}

	@Override
	public ResultSet getAllEmpDetailsDao() {
		
		return null;
	}

	@Override
	public ResultSet searcEmpDetailsDao(String email) {
		
		return null;
	}

}
