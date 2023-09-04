package in.sp.bean;

public class Student {
	/*
	public Student(int a) {
		System.out.println("Contructor Invoked!");
	}
	If we use parameterized constructor, bean instantiation will not occur, we will get this error "Instantiation of bean failed; " 
	*/
	public Student() {
		System.out.println("Contructor Invoked!");
	}
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
		System.out.println("Hello");
		//System.out.println("Name: " + name);
		//System.out.println("RollNo: " + rollno);
	}
}
