package in.sp.beans;

public class Student {
//creating javabean class
	private String name;
	private String rollno;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rollno);
		System.out.println("Marks: "+marks);
	}
	
	
}
