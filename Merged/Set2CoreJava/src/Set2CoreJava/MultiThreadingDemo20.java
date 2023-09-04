package Set2CoreJava;

class MyThread20 extends Thread {
	public void run() {
		try {
			System.out.println("IS INTERRUPTED: "+Thread.currentThread().interrupted());
			for (int i = 1; i < 6; i++) {
				System.out.println("Hi");
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("IS INTERRUPTED: "+Thread.currentThread().interrupted());
		/*Output:
		 * IS INTERRUPTED: true
Hi
Hi
Hi
Hi
Hi
IS INTERRUPTED: false
interrupted() method will change the true status to false but will not change false statement to 
to true. False will remain false. 
		 */
	}
}
public class MultiThreadingDemo20 {
	public static void main(String[] ags) {
		MyThread20 ob = new MyThread20();
		ob.start();

		ob.interrupt();
		}
}

