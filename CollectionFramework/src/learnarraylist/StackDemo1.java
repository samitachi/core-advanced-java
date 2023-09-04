package learnarraylist;

import java.util.Stack;

public class StackDemo1 {
	public static void main(String[] args) {
		Stack<String> animal = new Stack<>();
		animal.push("Lion");
		animal.push("Cat");
		animal.push("dog");
		animal.push("horse");
		System.out.println(animal);/*Output:
		[Lion, Cat, dog, horse]*/
		System.out.println(animal.peek());//output: horse //last animal is shown here
		animal.pop(); //last animal gets popped out
		System.out.println(animal.peek());//output:dog //2nd last animal is now peeked
	}
	
}
