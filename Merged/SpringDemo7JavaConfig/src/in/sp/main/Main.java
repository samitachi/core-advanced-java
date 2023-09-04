package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		
		Student std =(Student) context.getBean("stdObj");
		std.display();
/*Without JAR Aop jar file,gwttinig this error
 * "Exception in thread "main" java.lang.NoClassDefFoundError: org/springframework/aop/TargetSource"*/
	}
}
