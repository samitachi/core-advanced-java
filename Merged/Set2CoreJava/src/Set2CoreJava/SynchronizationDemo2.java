package Set2CoreJava;

class BookTrainSeat1 {
	int total_seats = 10;

	synchronized public void bookSeat(int seats) {
		if (total_seats > seats) {
			System.out.println("Seats booked Sucessfully: ");
			System.out.println("Seats Remaining: " + (total_seats = total_seats - seats));
		} else {
			System.out.println("Booking Failed " + "Seats Remaining: " + (total_seats - seats));
		}
	}
}
class MultiThreadTicket1 extends Thread {
	BookTrainSeat1 bts;
	int seats;

	public MultiThreadTicket1(BookTrainSeat1 bts, int seats) {
		this.bts = bts;
		this.seats = seats;
	}

	public void run() {

		bts.bookSeat(seats);
	}
}

public class SynchronizationDemo2 {
	public static void main(String[] args) {
		BookTrainSeat1 bts = new BookTrainSeat1();
		MultiThreadTicket1 Aayush = new MultiThreadTicket1(bts, 5);
		Aayush.start();

		MultiThreadTicket1 Shashwat = new MultiThreadTicket1(bts, 4);
		Shashwat.start();

		MultiThreadTicket1 Kunal = new MultiThreadTicket1(bts, 4);
		Kunal.start();
	}
}/*
	 * Output: Seats booked Sucessfully: Seats Remaining: 5 Seats booked
	 * Sucessfully: Seats Remaining: 1 Booking Failed Seats Remaining: -3
	 */
/*Firsly bts object will be created. Every object has 2 parts, one synchronized area and other is 
 *non synchronized area. Every thread here, Aayush, Shashwat and Kunal will get lock access for 
 *synchronized  area one by one.This way data inconsistency problem will be solved.
 */
 
