package Set2CoreJava;

class BookTrainTicketAlgo3 {
	static int availableTicket = 10;

	static synchronized public void bookTicket(int ticket) {

		if (availableTicket > ticket) {
			System.out.println("Ticket Booked Sucessfully: ");
			System.out.println("Available Tickets: " + (availableTicket = availableTicket - ticket));
		} else {
			System.out.println("Booked Failed ");
		}
	}
}

class BookTrainTicketThread4a extends Thread {
	int ticket;
	BookTrainTicketAlgo3 btt;

	public BookTrainTicketThread4a(BookTrainTicketAlgo3 btt, int ticket) {
		this.btt = btt;
		this.ticket = ticket;
	}

	public void run() {
		btt.bookTicket(ticket);
	}
}

class BookTrainTicketThread4a1 extends Thread {
	int ticket;
	BookTrainTicketAlgo3 btt;

	public BookTrainTicketThread4a1(BookTrainTicketAlgo3 btt, int ticket) {
		this.btt = btt;
		this.ticket = ticket;
	}

	public void run() {
		btt.bookTicket(ticket);
	}
}

public class SynchronizationDemo5 {
	public static void main(String[] args) {
		BookTrainTicketAlgo3 btt = new BookTrainTicketAlgo3();
		BookTrainTicketThread4a ob1 = new BookTrainTicketThread4a(btt, 5);
		ob1.start();
		BookTrainTicketThread4a ob2 = new BookTrainTicketThread4a(btt, 4);
		ob2.start();

		BookTrainTicketThread4a1 ob3 = new BookTrainTicketThread4a1(btt, 5);
		ob3.start();
		BookTrainTicketThread4a1 ob4 = new BookTrainTicketThread4a1(btt, 6);
		ob4.start();
	}
}/*Output:
Ticket Booked Sucessfully: 
Available Tickets: 5
Booked Failed 
Ticket Booked Sucessfully: 
Available Tickets: 1
Booked Failed 

Now, any of the ob1,ob2,ob3,ob4 can get lock access of resource. Now objects created from 
seperate classes will not have access to resource lock seperately.*/