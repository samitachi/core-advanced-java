package in.sp.dao;

import java.sql.ResultSet;

import in.sp.beans.Employee;

public interface EmployeeDao {
//THIS IS FOR DAO LAYER
public boolean addEmpDetailsDao(Employee emp);
public boolean updateEmpDetailsDao(Employee emp);
public boolean deleteEmpDetailsDao(String email);
public ResultSet getAllEmpDetailsDao();
public ResultSet searcEmpDetailsDao(String email);

}
