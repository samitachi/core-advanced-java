package Set2CoreJava;

class TicketEarning extends Thread {
	int TicketEarning=0;
	int TicketPrice = 100;
        public void run() {
        	synchronized(this) {
		for (int i = 1; i <= 10; i++) {
			TicketEarning = TicketEarning + TicketPrice;
			
		}
		this.notify();
        	}
	}
}
public class SynchronizationDemo6 {
	public static void main(String[] args) throws Exception {
		TicketEarning te = new TicketEarning();
		te.start();
		synchronized(te) {
		te.wait();
		System.out.println("Total Earning: " + te.TicketEarning);
        }
	}
}
