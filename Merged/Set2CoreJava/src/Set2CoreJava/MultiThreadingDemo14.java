package Set2CoreJava;

class MyThread14 extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class MultiThreadingDemo14 {
	public static void main(String[] args) {
		MyThread14 ob = new MyThread14();
		ob.start();
	}
}
