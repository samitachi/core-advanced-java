package in.sp.bean;

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
	public void initializestdobj() {
		name="Deepak";
		rollno=111;
	}
	//With this getter-setter is not needed. 
}
