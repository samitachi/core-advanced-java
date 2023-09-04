package Set2CoreJava;

import java.util.concurrent.locks.ReentrantLock;

class BookTicketAlgo {
	ReentrantLock re = new ReentrantLock();
	int total_seats = 10;

	void bookTicket(int seats) {
		re.lock();// any thread will acquire the lock here
		if (total_seats >= seats) {
			System.out.println("Success");
			total_seats = total_seats - seats;
			System.out.println("Seats Left: " + total_seats);
		} else {
			System.err.println("fail");
		}
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("-----------------");
		m1();
	}

	public void m1() {
		System.out.println("Hi");
		re.unlock();// any thread will unlock here to give to other thread
		// if we are locking then we must unlock as well,otherwise other threads will
		// keep waiting
		System.out.println(re.getHoldCount());
		System.out.println(re.isLocked());
		// tryLock() should be declared with if condition as it returns boolean values.
	}
}

class BookTicketThread extends Thread {
	int seats;
	BookTicketAlgo bt1 = new BookTicketAlgo();

	BookTicketThread(BookTicketAlgo bt1, int seats) {
		this.bt1 = bt1;
		this.seats = seats;
	}

	public void run() {
		bt1.bookTicket(seats);
	}
}

public class LockInterfaceDemo1 {
	public static void main(String[] args) {
		BookTicketAlgo bt1 = new BookTicketAlgo();
		BookTicketThread btt1 = new BookTicketThread(bt1, 3);
		BookTicketThread btt2 = new BookTicketThread(bt1, 5);
		BookTicketThread btt3 = new BookTicketThread(bt1, 5);
		btt1.start();
		btt2.start();
		btt3.start();

	}
}/*Success
Seats Left: 7
-----------------
Hi
0
false
Success
Seats Left: 2
-----------------
Hi
0
fail
false
-----------------
Hi
0
false
 */
