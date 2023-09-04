package in.sp.bean;

public class Student {

	public Student(int a) {
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
	}

}
