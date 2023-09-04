package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("stdObj") //By default class name is set but we can give name like this from our side as well
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
