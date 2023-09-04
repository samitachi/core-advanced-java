package learnarraylist;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListQueueDemo1 {
	public static void main(String[] args) {
		// Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(12);
		queue.offer(24);
		queue.offer(36);

		System.out.println(queue);
		System.out.println(queue.poll()); // Shows the first element that gets removed

		System.out.println(queue);
		System.out.println(queue.peek()); // shows the next element that is next to get removed
	}
}/*
	 * Output: [12, 24, 36] 12 [24, 36] 24
	 */
//There is other function like offer i.e. (add) but if there is any issue while adding it will cause exception.Thus, if we want our program to crash we can use add.
