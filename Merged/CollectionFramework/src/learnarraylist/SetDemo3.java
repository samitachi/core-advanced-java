package learnarraylist;


import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {
	
		public static void main(String[] args) {
			Set<Integer> set = new TreeSet<>();
			set.add(15);
			set.add(7);
			set.add(99);
			set.add(44);
			set.add(33);
			System.out.println(set);
		}
	}
/*Output:[7, 15, 33, 44, 99] */
//additional to linkedhashset it also sorts the array.
