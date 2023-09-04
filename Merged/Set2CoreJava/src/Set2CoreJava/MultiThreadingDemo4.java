package Set2CoreJava;

class MTDemo1 extends Thread {
	public void run() {
		System.out.println("Hi");
	}
	public void run(int a) {
		System.out.println(a);
	}
}


public class MultiThreadingDemo4 {
	public static void main(String[] args) {
		MTDemo1 mtd = new MTDemo1();
		mtd.start();
		//mtd.start(10); it won' work but "mtd.run(10);" will work
		
	}

}
