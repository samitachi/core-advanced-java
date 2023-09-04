package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		
		//Student std =(Student) context.getBean("CreatBeanObj1");
		Student std =(Student) context.getBean("stdobj1");
		
		std.display();
		//If we write bean name seperately then we cannot call bean object with method name
//It will show following exception"Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'CreatBeanObj1' available"

	}
}
