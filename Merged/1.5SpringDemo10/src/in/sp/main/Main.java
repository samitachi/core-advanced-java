package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Employee;
import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/stdAppContext.xml",
				"/in/sp/resources/empAppContext.xml");
		//MultipleSpringCnfigurationPath can be provided.
		
		Student std = (Student) context.getBean("stdObj");
		std.display();
		
		System.out.println("----------------------");
		
		Employee emp= (Employee)context.getBean("empObj");
		emp.EmpDisplay();
	}
}
