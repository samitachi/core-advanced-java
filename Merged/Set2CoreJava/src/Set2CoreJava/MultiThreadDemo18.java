package Set2CoreJava;

class MyThread18 extends Thread {
	public void run() {
		try {
			System.out.println("IS INTERRUPTED: "+Thread.currentThread().isInterrupted());
			for (int i = 1; i < 6; i++) {
				System.out.println("Hi");
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
public class MultiThreadDemo18 {
	public static void main(String[] ags) {
		MyThread18 ob = new MyThread18();
		ob.start();

		ob.interrupt();
		/*
		 * By default interrupt status is false, so if there is no sleeping method,
		 * interrupt method is of no use. If sleep method is on, and code finds
		 * interrupt method it changes the interrupt status to true, then in child
		 * thread, leaves try block and comes to exception block.
		 */
	}// Output: Hi
//java.lang.InterruptedException: sleep interrupted
}
