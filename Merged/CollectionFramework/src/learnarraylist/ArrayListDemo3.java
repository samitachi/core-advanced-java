package learnarraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		list.add(4);
		list.add(1, 25);
		System.out.println(list);
		}
}//Output:[1, 2, 3]
//[1, 25, 2, 3, 4]
