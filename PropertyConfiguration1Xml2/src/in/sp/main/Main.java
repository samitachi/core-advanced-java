package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.bean.Student;

public class Main {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
	
	Student std = context.getBean("stdId",Student.class);
	std.display();
	}
}
