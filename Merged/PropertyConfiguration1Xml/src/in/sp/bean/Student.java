package in.sp.bean;

import java.util.List;

public class Student {
private String name;
private int rollno;
private List<String> subjects;

public List<String> getSubjects() {
	return subjects;
}
public void setSubjects(List<String> subjects) {
	this.subjects = subjects;
}
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
	System.out.println("Name: "+name);
	System.out.println("roll no "+rollno);
	System.out.println("Subjects "+subjects);
}
}
