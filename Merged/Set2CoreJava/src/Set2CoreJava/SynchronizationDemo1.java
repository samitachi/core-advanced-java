package Set2CoreJava;

class BookTrainSeat {
	int total_seats = 10;

	 synchronized public void bookSeat(int seats) {
		if (total_seats > seats) {
			System.out.println("Seats booked Sucessfully: ");
			System.out.println("Seats Remaining: " + (total_seats=total_seats - seats));
		}
		else {
			System.out.println("Booking Failed "+"Seats Remaining: " + (total_seats - seats));
		}
	}
}

class MultiThreadTicket extends Thread {
	BookTrainSeat bts;
	int seats;

	public MultiThreadTicket(BookTrainSeat bts, int seats) {
		this.bts = bts;
		this.seats = seats;
	}

//Constructor to pass object of BookTrainSeat class to MultiThreadTicket class.
	public void run() {
//MultiThreadTicket ob = new MultiThreadTicket();
//ob.bookSeat(); 
// We cannot call the method of BookTrainSeat class with object of MultiThreadTicket class 

		bts.bookSeat(seats);
	}
}

public class SynchronizationDemo1 {
	public static void main(String[] args) {
		BookTrainSeat bts = new BookTrainSeat();
		// Without this we were getting null pointer exception.So we created its object
		// and passed
		// below.
		MultiThreadTicket Aayush = new MultiThreadTicket(bts,5);
		Aayush.start();

		MultiThreadTicket Shashwat = new MultiThreadTicket(bts,4);
		Shashwat.start();

		MultiThreadTicket Kunal = new MultiThreadTicket(bts,4);
		Kunal.start();
	}
}/*Output:
Seats booked Sucessfully: 
Seats booked Sucessfully: 
Seats booked Sucessfully: 
Seats Remaining: 1
Seats Remaining: 6
Seats Remaining: -3
Data Inconsistency is happening. To avoid this we do synchronization. Watch Video: Synchronization 1.*/


