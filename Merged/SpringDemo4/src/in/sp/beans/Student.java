package in.sp.beans;

public class Student {
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
	System.out.println("RollNo: "+rollno);
	System.out.println("Marks: "+marks);

}
}
