package Set2CoreJava;
class ThreadTask implements Runnable{
	public void run() {
		System.out.println("hi");
	}
}
public class CallableAndFutureInterfaceDemo1 {
public static void main(String[] args) {
	ThreadTask tt = new ThreadTask();
	Thread t1=new Thread(tt);
	t1.start();
}//Here after execution of thread it dies. Its return type is void, it does not return value
//If we want our thread returns something than we use callable interface
}
