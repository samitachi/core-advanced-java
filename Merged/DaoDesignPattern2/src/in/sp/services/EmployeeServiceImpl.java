package in.sp.services;

import java.sql.ResultSet;
//THIS IS FOR SERVICE LAYER
import in.sp.beans.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public boolean addEmpDetails(Employee Emp) {
		
		return false;
	}

	@Override
	public boolean updateEmpDetails(Employee Emp) {
		
		return false;
	}

	@Override
	public boolean deleteEmpDetails(String email) {
		
	return false;
	}

	@Override
	public ResultSet getAllEmpDetails() {
		
		return null;
	}

	@Override
	public ResultSet searchEmpDetails(String email) {
		
		return null;
	}

}
//We are doing like this as we want to hide our implementation, hence we will achieve abstraction
