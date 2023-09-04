package in.sp.bean;

import javax.annotation.PostConstruct;

public class Student {

	private String name;
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
		System.out.println("RollNo: " + rollno);
	}

	@PostConstruct
	// if we dont write @PostConstruct, we get "Name: null RollNo: 0"
	public void initializeStdObj() {
		name = "Mohit";
		rollno = 121;
		System.out.println("custom inititlaize method invoked");
	}

	public void destroystdObj() {
		name = "";
		rollno = 0;
		System.out.println("Custom destrory method invoked");
		context.registerShutdownHook();
	}

}
