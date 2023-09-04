package Set2CoreJava;

class MTDemo extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Child Thread");
}
	}
}

public class MultiThreadingDemo1 {
	public static void main(String[] args) {
		MTDemo t1 = new MTDemo();
		t1.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("Parent Thread");
		}
	}
}
//Both main thread and run thread are running simultaneously
/*
 * Steps to create thread using thread class 1.inherit the "Thread" class
 * 2.override the run method 3.create teh instance of the class 4.start the
 * thread
 */
