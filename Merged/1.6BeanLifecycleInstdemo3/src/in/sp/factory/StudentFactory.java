package in.sp.factory;

import in.sp.bean.Student;
//Earlier we made static method,but this time, we dont want to use static method
//Again this method will not be executed on its own, we have to write
public class StudentFactory {
public Student createStobj() {
	System.out.println("Instance Factory method invoked");
	Student std =new Student(10);
	return std;
}
}
