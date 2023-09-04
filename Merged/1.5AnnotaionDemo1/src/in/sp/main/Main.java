package in.sp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		//by just writing component in the bean class, compiler will not read the bean class and bean objects will not be created
		//"Error: No bean named 'student' available" //
		context.register(Student.class);//So we have to register
		//if we dont do refresh,error will come" AnnotationConfigApplicationContext@5b6f7412 has not been refreshed yet"
		context.refresh();

		Student std = (Student) context.getBean("student");
		// Because of using @component bean name will be automatically set as class name
		// with first letter as small
		std.display();
	}
}
