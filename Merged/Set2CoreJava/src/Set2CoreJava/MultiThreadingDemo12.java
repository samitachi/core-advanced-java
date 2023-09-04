package Set2CoreJava;
class MyThread12 extends Thread{
	public void run() {
		
		System.out.println("Child Thread: "+Thread.currentThread().getPriority());
	}
}

public class MultiThreadingDemo12 {
public static void main(String[] args) {
	Thread.currentThread().setPriority(6);
	MyThread12 ob = new MyThread12();
	ob.setPriority(8);//By default main thread also had priority of 5.
	System.out.println("Main Thread: "+Thread.currentThread().getPriority());
	ob.start(); 
	}//Output: Main Thread: 6 Child Thread: 8
}
