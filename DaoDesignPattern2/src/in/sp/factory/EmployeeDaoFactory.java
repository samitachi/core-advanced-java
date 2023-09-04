package in.sp.factory;

import in.sp.beans.Employee;
import in.sp.dao.EmployeeDao;
import in.sp.dao.EmployeeDaoImpl;
import in.sp.services.EmployeeServiceImpl;

public class EmployeeDaoFactory {
	private static Employee empdao;
	static {
		empdao = new EmployeeServiceImpl();
	}

	public static EmployeeDao getEmployeeDao() {
		return empdao;
	}
}
