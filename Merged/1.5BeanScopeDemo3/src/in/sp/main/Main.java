package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		Student std1 = (Student) context.getBean("stdObj");
		System.out.println(std1);

		Student std2 = (Student) context.getBean("stdObj");
		System.out.println(std2);

		Student std3 = (Student) context.getBean("stdObj");
		System.out.println(std3);

	}
}

/*Output
 * in.sp.beans.Student@64d2d351
in.sp.beans.Student@1b68b9a4
in.sp.beans.Student@4f9a3314
Different References are getting created with prototype scope*/
