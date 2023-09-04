//Other datasets were used to store data, but map is used to store key-value pair
package learnarraylist;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
	public static void main(String[] args) {
		Map<String, Integer> numbers = new HashMap<>(); // map stores the value in the form of key-value pair; Here, key
														// is of type string, and value is of type Integer
//we can use multiple maps like hashmap, tree map etc with map.
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		numbers.put("One", 2);
		System.out.println(numbers);
	
	//we can keep same value name for 2 different keys but we cannot give different value to same key.
	//Output:{One=2, Two=2, Three=3} //upgraded values of repeated keys  is taken
	
	//to keep  he old value of the key and not the updated one, we use
	if(!numbers.containsKey("Two")) {
		numbers.put("Two",23);
	}
	System.out.println(numbers);
	}
}
