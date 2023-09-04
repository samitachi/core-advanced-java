package Set2CoreJava;
//multiple threads single task
//Single thread can perform only one task
//as threads are the basic element of the process,so one thread can do only one task
/*class multithread extends Thread{
	public void run() {
		System.out.println("Hi");
	}
}
public class MultiThreadDemo7 {
	public static void main(String[] args) {
		multithread mt1 =new multithread();
		mt1.start();
		multithread mt2 = new multithread();
		mt2.start();
		}
}*/
//multiple threads multiple tasks //Here all 3 threads are running simultaneously
class GreetHi extends Thread{
	public void run() {
		System.out.println("Hi");
	}
}
class GreetHello extends Thread{
	public void run() {
		System.out.println("Hello");
	}
}
public class MultiThreadDemo7 {
	public static void main(String[] args) {
		GreetHi ob1 = new GreetHi();
		ob1.start();
		GreetHello ob2 = new GreetHello();
		ob2.start();
	}
}