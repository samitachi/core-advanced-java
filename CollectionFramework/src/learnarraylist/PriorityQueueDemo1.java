package learnarraylist;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo1 {
	public static void main(String[] args) {
		/*
		Queue<Integer> pq = new PriorityQueue();
		pq.offer(40);
		pq.offer(30);
		pq.offer(20);
		pq.offer(12);
		pq.offer(15);
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		System.out.println(pq.peek());
	}
}
/*Output:
 * [12, 15, 30, 40, 20]
[15, 20, 30, 40]
15
priority queue arranges the data with min in front
 */
		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		//(Comparator.reverseOrder()) changes min to max 
		pq.offer(40);
		pq.offer(30);
		pq.offer(20);
		pq.offer(12);
		pq.offer(15);
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		System.out.println(pq.peek());
	}
}
/*Output
 * [40, 30, 20, 12, 15]
[30, 15, 20, 12]
30
 * 
 */
