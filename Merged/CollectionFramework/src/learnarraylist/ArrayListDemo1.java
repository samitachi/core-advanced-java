package learnarraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		/*
		 * String[] student = new String[30]; student[0] = "Rakesh"; student[29] =
		 * "Raman"; // student[30]="Hrish"; //Array out of bound exception will occur,as
		 * size is // fixed. // Thus to make scalable projects we use ArrayList }
		 */
		ArrayList<String> studentname = new ArrayList<>();
		studentname.add("Rakesh");
		studentname.add("Harish");
		System.out.println(studentname);
	}
}/*Output
[1, 2, 3]
[1, 25, 2, 3, 4]*/
