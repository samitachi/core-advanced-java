package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Employee;
import in.sp.beans.Student;
import in.sp.resources.StdConfigFile;
import in.sp.resources.empConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StdConfigFile.class,empConfigFile.class);
		Student std = (Student) context.getBean("stdObj");
		std.display();
		
		System.out.println("----------------------");
		
		Employee emp= (Employee)context.getBean("empObj");
		emp.EmpDisplay();
	}
}
