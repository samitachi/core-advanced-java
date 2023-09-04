package Set2CoreJava;

class MyThread19 extends Thread {
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
		//After interrupting thread, interrupt status comes back to false
		System.out.println("IS INTERRUPTED: "+Thread.currentThread().isInterrupted());
	}
}
public class MultiThreadDemo19 {
	public static void main(String[] ags) {
		MyThread20 ob = new MyThread20();
		ob.start();

		ob.interrupt();
		ob.interrupt();//writing it twice will no cause any effect.
		/*
		 * // Output: IS INTERRUPTED: true
Hi
java.lang.InterruptedException: sleep interrupted
IS INTERRUPTED: false
		 */
	}
}

