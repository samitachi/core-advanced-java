package learnarraylist;

import java.util.HashSet;
import java.util.Set;

public class SetForStudent {
public static void main(String[] args) {
	Set<Student> studentset =	new HashSet<>();
	studentset.add(new Student("Anuj", 2));
	studentset.add(new Student("bheem", 3));
	
	studentset.add(new Student("firoz", 8));
	studentset.add(new Student("shivam", 8));
	/*Output:
	 * [Student: firoz roll no 8, Student: Anuj roll no 2, Student: bheem roll no 3, Student: shivam roll no 8]
	 * 2 student cannot have same roll no but here in spite of using set we are getting 2 students with same rollno
	 * it is because 2 different objects are getting created and set treats 2 different objects separately.  
	 */
	System.out.println(studentset);
	
	
	
}
}
