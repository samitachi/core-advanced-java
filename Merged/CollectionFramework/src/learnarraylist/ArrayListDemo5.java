package learnarraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println(list);
		list.remove(1); // to remove value at particular index value
		System.out.println(list);
		list.remove(Integer.valueOf(30));// To remove a particular type if
		System.out.println(list);
		list.set(2,1000); //To update list at a particular index
		System.out.println(list.contains(50));//returns boolean value, after checking the value
		System.out.println(list);
		list.clear();
		System.out.println(list);
	}
}
/*Output
 * [10, 20, 30, 40, 50, 60]
[10, 30, 40, 50, 60]
[10, 40, 50, 60]
false
[10, 40, 1000, 60]
[]


*/
