package in.sp.bean;

import java.util.List;
import java.util.Map;

public class Student {
private String name;
private int rollno;
private Map<String,Integer>subjmarks;


public Map<String, Integer> getSubjmarks() {
	return subjmarks;
}
public void setSubjmarks(Map<String, Integer> subjmarks) {
	this.subjmarks = subjmarks;
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
	System.out.println("Subjects & Marks "+subjmarks);
}
}
