package Set2CoreJava;
class MTDemo2 extends Thread{
	//Nothing is here so ob.start() will call the run method of Thread class which is empty
	//So it will output empty
}

public class MultiThreadingDemo5 {
public static void main(String[] args) {
	MTDemo2 ob = new MTDemo2();
	ob.start(); 
}
}
