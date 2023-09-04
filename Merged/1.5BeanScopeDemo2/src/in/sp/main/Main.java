package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
		/*
		 * Student std = (Student) context.getBean("stdObj"); std.display(); //Output:
		 * Name: Kamal Roll No: 111
		 */

		// here scope is singleton

		Student std1 = (Student) context.getBean("stdObj");
		//if we write prototype as "<bean class="in.sp.beans.Student" id="stdObj" scope="prototype">"then different
		//references will created everytime.
		System.out.println(std1);
		Student std2 = (Student) context.getBean("stdObj");
		System.out.println(std2);
		Student std3 = (Student) context.getBean("stdObj");
		System.out.println(std3);
		/*Result: Same Reference is getting created everytime
		 * in.sp.beans.Student@610694f1
           in.sp.beans.Student@610694f1
           in.sp.beans.Student@610694f1
		 */

	}
}
