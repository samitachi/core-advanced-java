package Set2CoreJava;

class ThreadTask3 implements Runnable {
	ThreadLocal tl = new ThreadLocal();

	public void run() {
		System.out.println("Hi");
		tl.set("Deepak");
		display();
	}

	void display() {
		System.out.println("Hi: " + tl.get()); // Output: Hi: Deepak
		tl.remove();
		System.out.println("Hi: " + tl.get());// Output: Hi: null
//Thread local sets a value with the thread which can be used in the thread until thread is getting executed.
	}
}

public class ThreadLocalDemo1 {
	public static void main(String[] args) {
		ThreadTask3 tt = new ThreadTask3();
		Thread t = new Thread(tt);
		t.start();
	}
}
