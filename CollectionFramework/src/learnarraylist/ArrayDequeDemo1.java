package learnarraylist;

import java.util.ArrayDeque;

public class ArrayDequeDemo1 {
	public static void main(String[] args) {
		ArrayDeque<Integer> adq = new ArrayDeque<>(); // ArrayDeque is class in itself

		adq.offer(15); // offer method comes from queue
		adq.offerFirst(45); // offerFirst method comes from ArrayDeque
		adq.offerLast(85);// offerFirst method comes from ArrayDeque, its function is same as offer
							// method.through this we can add values from both front and rear
		System.out.println(adq);
	}
}
/*
 * output:
 * [45, 15, 85]*/
