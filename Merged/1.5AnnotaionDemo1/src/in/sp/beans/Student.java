package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//we are making objects of this class only,so will write component here,
@Component
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
