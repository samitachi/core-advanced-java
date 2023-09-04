package Set2CoreJava;

class MyThread implements Runnable {
	// Runnable Interface is a functional interface, i.e. functional interface have
	// only 1 method
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("child THREAD");
		}
	}
	void show() {
		
	}
}

public class MultiThreadingDemo6 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
		
		for(int i=0;i<100;i++) {
			System.out.println("main THREAD");
		}
	mt.show(); //main thread will execute this statement
		//Here 2 threads will be created, one main thread and other is thread0.
		//We have to call start() with Thread class reference because start method 
		//is not present in runnable interface, it is present in Thread class only. 
	}
}
/*
 * Steps to create multithreads using Runnable Interface 1.inherit the
 * "Runnable"interface 2.override the run method 3.create the instance of the
 * class 4.create the Instance of the Thread class and pass the instance of the
 * previous class instance in thread class constructor 5.start the thread
 */