package learnarraylist;

import java.util.HashSet;
import java.util.Objects;

public class Student {
	String name;
	int rollno;

	public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student: " + name + " roll no " + rollno;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if ((o == null) || getClass() != o.getClass())
			return false;
		Student student = (Student) o;
		return rollno == student.rollno;

	}

	@Override
	public int hashCode() {
		return Objects.hash(rollno);
	}
	//this way hashcode generated will be same if their roll number is same.
}//Output:[Student: Anuj roll no 2, Student: bheem roll no 3, Student: firoz roll no 8]

