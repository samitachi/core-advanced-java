package learnarraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		list.add(4);
		System.out.println(list);
	}
}//Output:[1, 2, 3]
//[1, 2, 3, 4]
//Values gets added sequentially
