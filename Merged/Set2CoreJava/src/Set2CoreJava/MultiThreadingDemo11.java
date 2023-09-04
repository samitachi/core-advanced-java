package Set2CoreJava;
class MyThread11 extends Thread{
	public void run() {
		System.out.println("Child Thread: "+ Thread.currentThread().isDaemon());
	}
}

public class MultiThreadingDemo11 {
public static void main(String[] args) {
	MyThread11 t = new MyThread11();
	t.setDaemon(true);
	System.out.println("Main Thread: "+ Thread.currentThread().isDaemon());
	t.start();
	//t.setDaemon(true); //We cannot make the daemon thread once the thread has been started
	//Main thread cannot be made to daemon thread.
}
}
