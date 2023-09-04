package Set2CoreJava;
class MultiThread10 extends Thread{
	public void run() {
		System.out.println("Old Child Thread Name: "+Thread.currentThread().getName());
		Thread.currentThread().setName("Aayush");
		System.out.println("New Child Thread Name: "+Thread.currentThread().getName());
	}
}

public class MutiThreadingDemo10 {
public static void main(String[] args) {
	System.out.println("Old Main Thread Name: "+Thread.currentThread().getName());
	Thread.currentThread().setName("New Main");
	System.out.println("New Main Thread Name: "+Thread.currentThread().getName());
	MultiThread10 ob = new MultiThread10();
	ob.start();	
}
}
/*Output:
Old Main Thread Name: main
New Main Thread Name: New Main
Old Child Thread Name: Thread-0
New Child Thread Name: Aayush
*/