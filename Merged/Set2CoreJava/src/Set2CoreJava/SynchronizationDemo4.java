package Set2CoreJava;

class BookTrainTicketAlgo2 {
	int availableTicket = 10;

	public void bookTicket(int ticket) {

		if (availableTicket > ticket) {
			System.out.println("Ticket Booked Sucessfully: ");
			System.out.println("Available Tickets: " + (availableTicket = availableTicket - ticket));
		} else {
			System.out.println("Booked Failed ");
		}
	}
}

class BookTrainTicketThread1 extends Thread {
	int ticket;
	BookTrainTicketAlgo2 btt;

	public BookTrainTicketThread1(BookTrainTicketAlgo2 btt, int ticket) {
		this.btt = btt;
		this.ticket = ticket;
	}

	public void run() {
		btt.bookTicket(ticket);
	}
}

class BookTrainTicketThread2 extends Thread {
	int ticket;
	BookTrainTicketAlgo2 btt;

	public BookTrainTicketThread2(BookTrainTicketAlgo2 btt, int ticket) {
		this.btt = btt;
		this.ticket = ticket;
	}

	public void run() {
		btt.bookTicket(ticket);
	}
}

public class SynchronizationDemo4 {
	public static void main(String[] args) {
		BookTrainTicketAlgo2 btt = new BookTrainTicketAlgo2();
		BookTrainTicketThread1 ob1 = new BookTrainTicketThread1(btt, 5);
		ob1.start();
		BookTrainTicketThread1 ob2 = new BookTrainTicketThread1(btt, 4);
		ob2.start();

		BookTrainTicketThread2 ob3 = new BookTrainTicketThread2(btt, 5);
		ob3.start();
		BookTrainTicketThread2 ob4 = new BookTrainTicketThread2(btt, 6);
		ob4.start();
	}
}/*Output:
Ticket Booked Sucessfully: 
Ticket Booked Sucessfully: 
Available Tickets: 1
Available Tickets: 5
Booked Failed 
Booked Failed

Here two classes objects are getting formed seperately, due to which inspite of ticket getting over
success message came, to resolve this issue synchronized should be taken from object level to class level.  
*/
