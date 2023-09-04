package in.sp.services;

import java.sql.ResultSet;
//THIS IS FOR SERVICE LAYER
import in.sp.beans.Employee;
//It is  interface which contains all the methods of the service
public interface EmployeeService {
	public boolean addEmpDetails(Employee Emp); // It is adding employee details that's why it need employee bean
//insert into register values('---','---','---');

	public boolean updateEmpDetails(Employee Emp);
//update register set name='---',salary='---' where email='---';

	public boolean deleteEmpDetails(String email);
//delete from register where email='deepak@gmail.com';
//Based on sql queries we are sending the parameters

	public ResultSet getAllEmpDetails();
//select * from register;       ResultSet as return type because this sql query return result as returnSet

	public ResultSet searchEmpDetails(String email);
//select * from register where email='---';
}
