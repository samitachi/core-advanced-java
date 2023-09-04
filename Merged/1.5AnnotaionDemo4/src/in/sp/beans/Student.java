package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("stdObj") 
//Because of @Component we don't have to write <bean></bean> in xml file, it is taken care by annotation,
//but we have to register for different bean classes, which is not feasible for bigger projects where we 
//can have multiple bean classes,that's why we will use context schema.

//  <context:component-scan base-package="in.sp.beans" /> it will create the bean object for every class above which @component is written
public class Student {
	@Value("Priya")
	private String name;
	@Value("101")
	private int rollno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("rollno: " + rollno);
	}
}
