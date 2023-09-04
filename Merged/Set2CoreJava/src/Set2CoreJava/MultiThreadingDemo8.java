package Set2CoreJava;
class MTDemo4 implements Runnable{
	public void run() {
		System.out.println("1: "+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		//Since,currentThread is static method we can call it by it's class name.
}
}
public class MultiThreadingDemo8 {
	public static void main(String[] args) {
		MTDemo4 ob= new MTDemo4();
		Thread t =new Thread(ob, "Aayush");//(Get dropdown with ctrl+space)
		System.out.println("2: "+Thread.currentThread().getName());//Output: 2: main 1: Aayush
		System.out.println(Thread.currentThread().isAlive());
		//Output: TRUE TRUE; as both the strings are alive
		t.start(); //name of the above thread is "Aayush", Default is "thread0"
	}
	
}

