package Set2CoreJava;
class MTDemo1a extends Thread{
	public void run() {
			System.out.println("Hi");
	}
}

public class MutiThreadingDemo3 {
	public static void main(String[] args) {
		MTDemo1 mtd = new MTDemo1();
		mtd.run();//We can write like this but now thread is not created, it's just normal method call
	}//Similarly if we write start here and above both.

}
