package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Employee;

@Configuration
public class empConfigFile {
	@Bean
public Employee empObj() {
	Employee emp=new Employee();
	emp.setEmpName("Abhinav");
	emp.setEmpId(102);
	return emp;
}
}
