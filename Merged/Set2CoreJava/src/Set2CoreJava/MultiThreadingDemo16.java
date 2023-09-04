package Set2CoreJava;

class MyThread16 extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hi: " + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
public class MultiThreadingDemo16 {
	public static void main(String[] args) {
		MyThread16 ob = new MyThread16();
		ob.start();
		try {
			ob.join();//"main"thread will wait until"thread0"gets executed.
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello " + i);
			Thread.sleep(1000);
		}
	}
		catch(Exception e) {
			System.out.println(e);
		}
	}//Output: Hi: 1 Hi: 2 Hi: 3 Hi: 4 Hi: 5 Hello 1 Hello 2 Hello 3 Hello 4 Hello 5
}

