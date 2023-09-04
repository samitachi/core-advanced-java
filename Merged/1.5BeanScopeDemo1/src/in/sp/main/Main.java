package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
		
		
		Student std1 = (Student) context.getBean("stdObj");
		//if we write prototype as "<bean class="in.sp.beans.Student" id="stdObj" scope="prototype">"then different
		//references will created everytime.
		System.out.println(std1);
		Student std2 = (Student) context.getBean("stdObj");
		System.out.println(std2);
		Student std3 = (Student) context.getBean("stdObj");
		System.out.println(std3);
		/*Result: Different Reference is getting created everytime
		 * in.sp.beans.Student@887af79
           in.sp.beans.Student@7fac631b
           in.sp.beans.Student@5b87ed94
		 */

	}
}
