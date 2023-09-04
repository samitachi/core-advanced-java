package learnarraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		List<Integer> newlist = new ArrayList();
        newlist.add(100);
        newlist.add(150);
        list.addAll(newlist);
        System.out.println(list);//Output:[1, 2, 3, 100, 150]
        System.out.println(list.get(3));//Output://Output:100
	}
}
