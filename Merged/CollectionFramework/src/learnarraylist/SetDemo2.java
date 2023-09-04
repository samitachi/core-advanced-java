package learnarraylist;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(15);
		set.add(7);
		set.add(99);
		set.add(44);
		set.add(33);
		System.out.println(set);
	}
}
/*
Output:[15, 7, 99, 44, 33]
true
Same as hashset, but output is now in the order in which input was made*/