package Set2CoreJava;

class BookTrainTicketAlgo {
	int availableTicket = 10;

	public void bookTicket(int ticket) {
		
		try {
			for(int i=1;i<10;i++) {
				System.out.println(Thread.currentThread().getName()+":"+i);
				Thread.sleep(1000);
			}
		}
			catch(Exception e) {
				System.out.println(e);
			}
		//We wanted only if/else block to be synchronized not the try-catch block
		//For that we  will use synchronized block
		synchronized(this) //this is object reference 
		{
		if (availableTicket > ticket) {
			System.out.println("Ticket Booked Sucessfully: ");
			System.out.println("Available Tickets: " + (availableTicket = availableTicket - ticket));
		} else {
			System.out.println("Booked Failed ");
		}
	}
	}
}

class BookTrainTicketThread extends Thread {
	int ticket;
	BookTrainTicketAlgo btt;

	public BookTrainTicketThread(BookTrainTicketAlgo btt, int ticket) {
		this.btt = btt;
		this.ticket = ticket;
	}

	public void run() {
		btt.bookTicket(ticket);
	}
}

public class SynchronizationDemo3 {
	public static void main(String[] args) {
		BookTrainTicketAlgo btt = new BookTrainTicketAlgo();
		BookTrainTicketThread Aayush = new BookTrainTicketThread(btt, 5);
		Aayush.start();
		BookTrainTicketThread Shashwat = new BookTrainTicketThread(btt, 4);
		Shashwat.start();
		BookTrainTicketThread Kunal = new BookTrainTicketThread(btt, 4);
		Kunal.start();
	}

}
