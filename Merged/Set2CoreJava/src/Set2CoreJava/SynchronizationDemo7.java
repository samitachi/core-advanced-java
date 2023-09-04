package Set2CoreJava;
//Anonymous class
//We can call threads like this also
public class SynchronizationDemo7 {
public static void main(String[] args) {
	Thread t1 = new Thread(){
		public void run() {
			System.out.println("Hi");
		}
	};
	t1.start();
	Thread t2 = new Thread(){
		public void run() {
			System.out.println("Hello");
		}
	};
	t2.start();
	
}

}
