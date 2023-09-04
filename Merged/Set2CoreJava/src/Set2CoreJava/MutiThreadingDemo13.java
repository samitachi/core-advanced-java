package Set2CoreJava;
class MyThread13 extends Thread{
	public void run() {
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("Child Thread: "+Thread.currentThread().getPriority());
	}
}

public class MutiThreadingDemo13 {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(4);
		System.out.println("Main Thread: "+Thread.currentThread().getPriority());
		MyThread13 ob = new MyThread13();
		ob.start();
	}//Output:Main Thread: 4 Child Thread: 10
}
