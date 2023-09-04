package learnarraylist;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(15);
		set.add(7);
		set.add(99);
		set.add(44);
		set.add(33);
		System.out.println(set);
		System.out.println(set.contains(44));
		
	}
}
/*Output:
 * [33, 99, 7, 44, 15]
 * true
 * Here order is not fixed. According to each entry a new hash is created thus no repeated values are allowed
 */
