package Set2CoreJava;
class MyThread15 extends Thread{
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Child Thread: "+ i+Thread.currentThread().getName());
		}
	}
}
public class MultiThreadingDemo15 {
	public static void main(String[] args) {
		MyThread15 ob = new MyThread15();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main Thread: "+ i+Thread.currentThread().getName());
		}
		Thread.yield();
		ob.start();
	}
}//Check Notes
