package learnarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo6 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		/*
		 * for(int i=0;i<list.size();i++) {
		 * System.out.println("The value at index "+i+" is "+list.get(i)); }
		 */
		/*
		 * Output:The value at index 0 is 1 The value at index 1 is 2 The value at index
		 * 2 is 3 The value at index 3 is 4 The value at index 4 is 5
		 */
		/*
		 * for(Integer element:list) {
		 * System.out.println("The value at index "+i+" is "+list.get(i)); }
		 */
		Iterator<Integer> it = list.iterator(); // Every collection framework has iterator,
		while (it.hasNext()) {
			System.out.println("Iterator" + it.next());
		}
		/*
		 * Output: Iterator1 Iterator2 Iterator3 Iterator4 Iterator5
		 * 
		 */
	}
}
